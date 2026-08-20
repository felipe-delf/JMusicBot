package br.com.jmusicbot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class JmusicbotApplication{


	public static void main(String[] args) {
		SpringApplication.run(JmusicbotApplication.class, args);

	}

}
