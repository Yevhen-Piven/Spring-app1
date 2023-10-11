package ua.com.yevhenpiven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Computer computer = context.getBean("computer", Computer.class);

		System.out.println(computer);

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
