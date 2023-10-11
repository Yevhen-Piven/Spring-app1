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
	public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic, @Qualifier("classicalMusic") ClassicalMusic classicalMusic ) {
		this.classicalMusic=classicalMusic;
		this.rockMusic=rockMusic;

	}

	

	public String playMusic(GenreOfMusic genreOfMusic) {
		return "Playing " + rockMusic.getSong() ;

	}
}