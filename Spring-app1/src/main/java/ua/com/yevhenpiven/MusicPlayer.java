package ua.com.yevhenpiven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
private RapMusic rapMusic;
@Autowired
public MusicPlayer(RapMusic rapMusic) {
	this.rapMusic=rapMusic;
}
public void playMusic() {
	System.out.println("Playing "+rapMusic.getSong());}}