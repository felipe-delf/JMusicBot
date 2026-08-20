package br.com.jmusicbot;

import br.com.jmusicbot.configuration.DiscordProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JmusicbotApplicationTests {



	@Test
	void contextLoads() {
	}

	@Autowired
	private DiscordProperties discordProperties;

}
