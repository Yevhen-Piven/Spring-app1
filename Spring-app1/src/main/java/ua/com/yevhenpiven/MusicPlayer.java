package ua.com.yevhenpiven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	//GenreOfMusic genreOfRockMusic = GenreOfMusic.ROCKMUSIC;
	//GenreOfMusic genreOfClassicalMusic = GenreOfMusic.CLASSICALMUSIC;
	ClassicalMusic classicalMusic;
	RockMusic rockMusic;


	@Autowired
	public MusicPlayer( RockMusic rockMusic,  ClassicalMusic classicalMusic ) {
		this.classicalMusic=classicalMusic;
		this.rockMusic=rockMusic;

	}
	GenreOfMusic CLASSICALMUSIC;
	GenreOfMusic ROCKMUSIC;
	

	public String playMusic(GenreOfMusic CLASSICALMUSIC) {
		
		
		if (CLASSICALMUSIC.equals(CLASSICALMUSIC)) {
			
		
		return "Playing " + classicalMusic.getSong();}
		else
			
			return "Playing " + rockMusic.getSong() ;

	}
}