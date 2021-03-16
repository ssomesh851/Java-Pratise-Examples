import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;

//import com.sun.org.apache.xerces.internal.util.URI;
//import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


//launch the application
public class Main extends Application {
	
	Player player;
	FileChooser fileChooser;
	
	public void start(final Stage primaryStage) throws MalformedURLException {
		
		//setting up the stages
		
		MenuItem open = new MenuItem("Open");
		
		Menu file = new Menu("File");
		
		MenuBar menu = new MenuBar();
		
		//connecting the above three
		
		file.getItems().add(open);  //It would connect open with file
		menu.getMenus().add(file);
		
		
		//adding functionality to swtich to different videos
		
		fileChooser = new FileChooser();
		open.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				//pausing the video while switching
				player.player.pause();
				File file = fileChooser.showOpenDialog(primaryStage);
				
				
				//choosing the file to play
				
				if(file != null) {
					player = new Player();
					Scene scene = new Scene(player, 720, 535, Color.BLACK);
					
					primaryStage.setScene(scene);	
					
				}		
			
			}
			});
			
			//here you can choose any video
		
//File file1 = new File("C:\\Users\\Relifin\\Downloads\\Project\\Courses\\Apache_Spark_for_Java_Developers\\1.Introduction\\1.Welcome.mp4");		

//file1.toURI();

		
player = new Player();		
//String file2 = null;


//player = new Player(file1.toURL().toString());


//player = new Player("C:\\Users\\Relifin\\Downloads\\Project\\Courses\\Apache_Spark_for_Java_Developers\\1. Introduction");

				
				//setting the menu at the top
	player.setTop(menu);
				
				//Adding player to the scene 
				
	Scene scene = new Scene(player, 720, 535, Color.BLACK);
				
				//height and width of the video player
				//background color set to the Black
				
	primaryStage.setScene(scene); //Setting the scene to stage
	primaryStage.show(); //Showing the stage
						
			
			
	}
	//main function to launch the application
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            launch(args);
	}

}
	
