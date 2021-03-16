
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;



public class MainMp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Relifin\\Downloads\\somesh_ringtone.mp3");
			Player player = new Player(fileInputStream);
			player.play();
			System.out.println("Song is playing");
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(JavaLayerException ex) {
			ex.printStackTrace();
		}

	}

}
