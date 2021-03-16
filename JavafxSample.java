
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class JavafxSample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating a group project
		
		Group group = new Group();
		
		Group group1 = new Group();
		
		//creating a Scene by passing the group object, height and width 
		
		Scene scene = new Scene(group, 300, 300);
		
		Scene scene1 = new Scene(group1, 400, 400);
		
		//setting color the scene
		
		scene.setFill(Color.BLACK);
		
		scene1.setFill(Color.GREEN);
		
		
		//setting the title to the page
		primaryStage.setTitle("Sample Application");
		
		
		//Adding the title to Stage
		
		primaryStage.setScene(scene);
		
		primaryStage.setScene(scene1);
		
		//Displaying the content of the stage
		
		primaryStage.show();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

}
