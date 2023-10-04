package ua.com.yevhenpiven;

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

private Music music;
public void setMusic(Music music) {
	this.music=music;
}

public void playMusic() {
	System.out.println("Playing "+music.getSong() +", Name: "+name+", Volume: "+volume);
	
	
}

}
