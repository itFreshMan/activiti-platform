package cn.jhs.activiti;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.jhs.activiti.platform","org.activiti"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	//jackson xml constants
	@Bean
	public ObjectMapper objectMapper(){
		return new ObjectMapper();
	}
}
