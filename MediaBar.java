import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;


public class MediaBar extends HBox{
	
	//MediaBar extends 	Horizonts
	//Introducing Sliders
	
	Slider time = new Slider(); //Slider for time
	Slider vol = new Slider(); //Slider for volume
	Button PlayButton = new Button("||"); //for pausing the player
	Label volume = new Label("Volume: ");
	MediaPlayer player;
	
	
	public MediaBar(MediaPlayer play) {
		//Default constructor taking
		// the MediaPlayer object
		player = play;
		
		
		setAlignment(Pos.CENTER); //SETTING THE HBox to center
		setPadding(new Insets(5, 10, 5, 10));
		//Setting the preference for volume bar
		
		vol.setPrefWidth(70);
		vol.setMinWidth(30);
		vol.setValue(100);
		
		HBox.setHgrow(time, Priority.ALWAYS);
		PlayButton.setPrefWidth(30);
		
		
		
		//Adding the components to the bottom
		
		getChildren().add(PlayButton); //volume button
		getChildren().add(time);   //time slider
		getChildren().add(volume);  //volume slider
		getChildren().add(vol);
		
		
		
		
		//Adding Functionality
		
		//to play the media player
		
		PlayButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Status status = player.getStatus(); //to get the status of the player
				if(status == status.PLAYING) {
					//If the status is video playing
					
					if(player.getCurrentTime().greaterThanOrEqualTo(player.getTotalDuration())) {
						// if the player is at the end of video
						
						player.seek(player.getStartTime()); //Restart the video
						player.play();
						
					}
					
					else {
						//pausing the player
						
						player.pause();
						PlayButton.setText(">");	
					}	
				} //if the video is stopped, halted or paused
				
				if(status == Status.HALTED || status == Status.STOPPED || status == Status.PAUSED) {
					
					player.play(); //start the video
					
					PlayButton.setText("||");
					
				}
				
				
			}
		});
		
		//providing the functionality to the time slider
		player.currentTimeProperty().addListener(new InvalidationListener() {
			public void invalidated(Observable ov) {
				updatesValues();
			}
		});
		
		
		//Inorder to jump to the certain part of the video
		
		
		time.valueProperty().addListener(new InvalidationListener() {
			public void invalidated(Observable ov)
			{
				if(time.isPressed()) {
					// It would set the time
					//as specified by users by pressing
					
					player.seek(player.getMedia().getDuration().multiply(time.getValue()/100));
					
					
				}
			}
			
		});
		
		
		//providing functionality to volume slider
		vol.valueProperty().addListener(new InvalidationListener() {
			 public void invalidated(Observable ov) {
				if(vol.isPressed()) {
					player.setVolume(vol.getValue()/100);
	  //it would set the volume
	// as specified by user
			
				}
			}
			
		});
	}
	
	
	//Outside the constructor
	
	protected void updatesValues() {
		
		Platform.runLater(new Runnable() {
			public void run()
			{
				//updating to the new time value
				//This will move the slider while running video
				
				time.setValue(player.getCurrentTime().toMillis());
				//time.setValue(player.getTotalDuration().toMillis()*100);
				
			}
			
		});
		
	}
}