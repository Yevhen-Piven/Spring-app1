package ua.com.yevhenpiven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		//Music music=context.getBean("musicBean", Music.class);
		//MusicPlayer musicPlayer=new MusicPlayer(music);
		MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		context.close();
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());

	}

}
