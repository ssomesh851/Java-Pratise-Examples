import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We got a Sequencer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicTest1 mt= new MusicTest1();
		mt.play();
	
	}

}
