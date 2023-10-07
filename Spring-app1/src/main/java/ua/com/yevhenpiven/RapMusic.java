package ua.com.yevhenpiven;

public class RapMusic implements Music {
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
