package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration 
@ImportResource({
    "classpath:spring-context-camel-task*.xml"
})
public class App
{
	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}
}
