package ua.com.yevhenpiven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

	@Override
	public String getSong() {
		ArrayList<String> classicalList = new ArrayList<String>();
		classicalList.add("Hungary Rapsody");
		classicalList.add("Symfonia №2");
		classicalList.add("Bohemian Rapsody");
		Random r=new Random();
		int randomiter=r.nextInt(classicalList.size());
		String randomClassicalMusic=classicalList.get(randomiter);		
		return randomClassicalMusic;
	}
}
