package ua.com.yevhenpiven;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	public String getName() {
		return name;
	}
	public int getVolume() {
		return volume;
	}
	ClassicalMusic classicalMusic;
	RockMusic rockMusic;
	RapMusic rapMusic;
	
	List<Music> listOfMusicGenre;


	
	public MusicPlayer(List<Music> listOfMusicGenre ) {
		this.listOfMusicGenre=listOfMusicGenre;
		listOfMusicGenre.add(classicalMusic);
		listOfMusicGenre.add(rockMusic);
		listOfMusicGenre.add(rapMusic);
	}
		public String playMusic() {
			
			Random r=new Random();
			int randomite=r.nextInt(listOfMusicGenre.size());
			String randomMusic=listOfMusicGenre.get(randomite).getSong();
		return "Playing " + randomMusic;
		

	}
}