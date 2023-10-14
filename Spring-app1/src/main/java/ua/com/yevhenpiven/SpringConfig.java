package ua.com.yevhenpiven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration

@PropertySource("musicPlayer.properties")
public class SpringConfig {
@Bean
public ClassicalMusic classicalMusic() {
	return new ClassicalMusic();
}
@Bean
public RockMusic rockMusic() {
	return new RockMusic();
}
@Bean 
public RapMusic rapMusic() {
	return new RapMusic ();
}
@Bean 
public List<Music> listOfMusicGenre(){
	return  Arrays.asList( classicalMusic(),  rockMusic(), rapMusic());
}
@Bean
public MusicPlayer musicPlayer() {
	return new MusicPlayer( Arrays.asList( classicalMusic(),  rockMusic(), rapMusic()) 
	);
}
//@Bean
//public Computer computer() {
	//return new Computer(musicPlayer(listOfMusicGenre()));
//}

}
