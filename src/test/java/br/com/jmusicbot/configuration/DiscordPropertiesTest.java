package br.com.jmusicbot.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
public class DiscordPropertiesTest {

    @Autowired
    private DiscordProperties discordProperties;

    @Test
    public void deveCarregarTokenDoDiscord(){
        assertNotNull(discordProperties.token());
        assertFalse(discordProperties.token().isBlank());
    }
}
