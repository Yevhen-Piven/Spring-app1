package ua.com.yevhenpiven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		RapMusic rapMusic=context.getBean("rapMusic", RapMusic.class);
		System.out.println(rapMusic.getSong());
		System.out.println(rapMusic.toString());
		RapMusic rapMusic2=context.getBean("rapMusic", RapMusic.class);
		System.out.println(rapMusic2.getSong()+" 2");
		System.out.println(rapMusic2.toString()+" 2");
		
		RockMusic rockMusic= context.getBean("rockMusic", RockMusic.class);
		System.out.println(rockMusic.getSong());
		System.out.println(rockMusic.toString());
		
		
		
		context.close();
		
		//Music music=context.getBean("musicBean", Music.class);
		//MusicPlayer musicPlayer=new MusicPlayer(music);
		//MusicPlayer firstMusicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
		//MusicPlayer secondMusicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
		
		//boolean comparison=firstMusicPlayer==secondMusicPlayer;
		//System.out.println(comparison);
		//System.out.println(firstMusicPlayer);
		//System.out.println(secondMusicPlayer);
		//firstMusicPlayer.setVolume(10);
		//firstMusicPlayer.playMusic();
		//secondMusicPlayer.playMusic();
		//
		//System.out.println(firstMusicPlayer.getName());
		//System.out.println(firstMusicPlayer.getVolume());
		//System.out.println(secondMusicPlayer.getName());
		//System.out.println(secondMusicPlayer.getVolume());

	}

}
