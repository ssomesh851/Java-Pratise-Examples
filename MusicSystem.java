
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;


/*
 * 
 * Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, 
 * command line flags, etc. It is not necessary that the set of constants in an enum type stay fixed for all time.
 */
enum Genre{
	POP,
	HIPHOP,
	JAZZ,
	FOLK,
	ROCK
}
class Song {
	int songID;
	String singer;
	String song_name;
	Genre type;
	
	Song(int ID, String singer, String songname, Genre type){
		this.songID =ID;
		this.singer = singer;
		this.song_name = songname;
		this.type = type;
	}
}

class MusicPlayer {
	ArrayList<Song> musiclist;
	Queue<Song> musicQ;
	int total_Song_Count;
	Random rand;
	
	MusicPlayer(){
		System.out.println("Initialize Music player");
		
		musiclist = new ArrayList<Song>();
		
		rand = new Random();
		
		musicQ = new LinkedList<Song>();
		
	}
	
	
	void addSong(int ID, String singer, String songname, Genre type) {
		musiclist.add(total_Song_Count, new Song(ID, singer, songname, type));
		total_Song_Count++;
		
	}
	
	
  void playRandomSong() {
	  
	  int rand_int = rand.nextInt(total_Song_Count);
	  Song playingSong = musiclist.remove(rand_int);
	  total_Song_Count--;
	  musicQ.add(playingSong);
	  System.out.println("The song is:"+ playingSong.song_name+" is been added to playing queue");
	  musiclist.add(playingSong);	  
  }
  
  void playSong(int ID, Boolean addtoQ)
  {
	  for(int i = 0; i<total_Song_Count; i++) {
		  Song x = (Song)musiclist.get(i);
		  if(x.songID==ID)
		  {
			  musiclist.remove(i);
			  total_Song_Count--;
			  
			  if(addtoQ) {
				  System.out.println("The song:"+x.song_name+" is currently played");
			  }
			  
			  else {
				  System.out.println("The song :"+ x.song_name+"is currently played");
			  }
			  
			  musiclist.add(x);
			  return;
		  }
	  }
	  
	  
	  for(int i = total_Song_Count; i<musiclist.size(); i++) {
		  Song x = (Song)musiclist.get(i);
		  if(x.songID ==ID)
		  {
			  if(addtoQ)
			  {
				  System.out.println("The song:"+x.song_name+" is been added to playing queue");
				  musicQ.add(x);
			  }
			  
			  else {
				  System.out.println("The Song: "+x.song_name+"is currently played.");
			  }
			  
			  return;
		  }
		  
	  }
	  
	  return;
  }
  
  void closeMusicPlayer() {
	  System.out.println("<<<<<<Closing Music Player >>>>>>>>>>");
	  musicQ.clear();
	  total_Song_Count=musiclist.size();
  }
  
  
  void playMusicFromQueue() {
	  //Play the from the queue and remove it from the queue
	  //if queue is empty wait till songs come in the queue
	  System.out.print("The Current Queue Contains: [ ");
	  
	  for(Song s: musicQ) {
		  System.out.println(s.song_name+" ");
	  }
	  
	  System.out.println("]");
  }
}


public class MusicSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicPlayer mp = new MusicPlayer();
		
		mp.addSong(1, "Maroon5", "Memories", Genre.POP);
		mp.addSong(2, "Queen","Bohemian Rhapsody",Genre.ROCK);
		mp.addSong(3, "Led Zepplin", "Stairway to Heaven",Genre.ROCK);
		mp.addSong(4, "Lee Morgan", "Coera", Genre.JAZZ);
		mp.addSong(5, "BennyGoodman","Sing Sing Sing", Genre.JAZZ);
		mp.playMusicFromQueue();
		
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playSong(3, true);
		mp.playMusicFromQueue();
		
		mp.closeMusicPlayer();
		
		
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playRandomSong();
		mp.playMusicFromQueue();
		

	}

}
