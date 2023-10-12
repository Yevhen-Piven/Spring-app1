package ua.com.yevhenpiven;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic implements Music {

	@Override
	public String getSong() {
		ArrayList<String> rockList = new ArrayList<String>();
		rockList.add("Highway to hell");
		rockList.add("We wiil rock you");
		rockList.add("American girl");
		Random r=new Random();
		int randomiter=r.nextInt(rockList.size());
		String randomRockMusic=rockList.get(randomiter);		
		return randomRockMusic;
	}

}
