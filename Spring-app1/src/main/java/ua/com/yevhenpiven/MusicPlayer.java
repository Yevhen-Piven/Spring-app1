package ua.com.yevhenpiven;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	public String name;
	public int volume;
	 
public void setName(String name) {
		this.name = name;
	}

	public String getName() {
	return name;
}

public int getVolume() {
	return volume;
}

	public void setVolume(int volume) {
		this.volume = volume;
	}

private List<Music> musicList =new ArrayList<>();




public void setMusicList(List<Music> musicList) {
	this.musicList = musicList;
}

public void playMusic() {
	for (Music music : musicList) {
		System.out.println("Playing "+music.getSong() +", Name: "+name+", Volume: "+volume);
	}
	
	
	
}

}
