package ua.com.yevhenpiven;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
@Override
public String getSong() {
	return"Hungary Rapsody";
}
}
