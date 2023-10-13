package ua.com.yevhenpiven;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class RapMusic implements Music {
	private RapMusic() {
	}

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
