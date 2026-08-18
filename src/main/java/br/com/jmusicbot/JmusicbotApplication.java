package br.com.jmusicbot;

import br.com.jmusicbot.domain.Calculadora;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmusicbotApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JmusicbotApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Calculadora calculadora = new Calculadora();

		calculadora.calculo(10,10);
	}
}
