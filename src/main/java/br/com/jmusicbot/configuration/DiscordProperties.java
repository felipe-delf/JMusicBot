package br.com.jmusicbot.configuration;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "discord")
public record DiscordProperties(@NotBlank(message = "DISCORD_TOKEN não configurado") String token) {
}