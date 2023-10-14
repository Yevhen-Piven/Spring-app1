package ua.com.yevhenpiven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class RapMusic implements Music {
	

	
	@Override
	public  String getSong() {
		List<String> rapMusic1=new ArrayList<>();
		rapMusic1.add("I am not afraid");
		rapMusic1.add("Candy shop");
		rapMusic1.add("Rap God");
		Random r=new Random();
		int randomiter=r.nextInt(rapMusic1.size());
		String randomRapMusic=rapMusic1.get(randomiter);
		return randomRapMusic;
	}

}
