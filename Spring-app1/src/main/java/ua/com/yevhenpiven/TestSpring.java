package ua.com.yevhenpiven;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		

		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
	//	Computer computer	= context.getBean("computer", Computer.class);
		//System.out.println(computer.toString());
		//System.out.println(musicPlayer.getVolume());
	//	System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.playMusic());
		
		
		
	//	ClassicalMusic classicalMusic=context.getBean("classicalMusic", ClassicalMusic.class);
		//RockMusic rockMusic=context.getBean("rockMusic", RockMusic.class);
		//RapMusic rapMusic=context.getBean("rapMusic", RapMusic.class);
		
		
		//ClassicalMusic classicalMusic2=context.getBean("classicalMusic", ClassicalMusic.class);
		//System.out.println(classicalMusic==classicalMusic2);
		//RockMusic rockMusic=context.getBean("rockMusic", RockMusic.class);
	//	RockMusic rockMusic2=context.getBean("rockMusic", RockMusic.class);
		//System.out.println(rockMusic==rockMusic2);
		context.close();

		// Music music=context.getBean("musicBean", Music.class);
		// MusicPlayer musicPlayer=new MusicPlayer(music);
		// MusicPlayer firstMusicPlayer=context.getBean("musicPlayer",
		// MusicPlayer.class);
		// MusicPlayer secondMusicPlayer=context.getBean("musicPlayer",
		// MusicPlayer.class);

		// boolean comparison=firstMusicPlayer==secondMusicPlayer;
		// System.out.println(comparison);
		// System.out.println(firstMusicPlayer);
		// System.out.println(secondMusicPlayer);
		// firstMusicPlayer.setVolume(10);
		// firstMusicPlayer.playMusic();
		// secondMusicPlayer.playMusic();
		//
		// System.out.println(firstMusicPlayer.getName());
		// System.out.println(firstMusicPlayer.getVolume());
		// System.out.println(secondMusicPlayer.getName());
		// System.out.println(secondMusicPlayer.getVolume());

	}

}
