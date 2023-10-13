package ua.com.yevhenpiven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan("ua.com.yevhenpiven")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

}
