package ua.com.yevhenpiven;

import org.springframework.stereotype.Component;

//@Component
public class RapMusic implements Music {
	private RapMusic() {}
	public static RapMusic getRapMusic() {
		return new RapMusic();
	}
	public void doMyInit() {
		System.out.println("doing my inicilization");
	}
	public void doMyDestroy() {
		System.out.println("doing my destraction");
	}
@Override
public String getSong() {
	return "I am not afraid";
}


}
