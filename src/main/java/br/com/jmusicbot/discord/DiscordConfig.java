package br.com.jmusicbot.discord;

import br.com.jmusicbot.configuration.DiscordProperties;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!test")
public class DiscordConfig {

    DiscordProperties discord;

    public DiscordConfig(DiscordProperties discord) {
        this.discord = discord;
    }

    @Bean(destroyMethod = "shutdown")
    public JDA jda() {
        JDABuilder builder = JDABuilder.createDefault(discord.token());

        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_VOICE_STATES,GatewayIntent.GUILD_MESSAGES);

        return builder.build();

    }
}
