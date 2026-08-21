package br.com.jmusicbot.discord.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public interface ISlashCommand {
    String getName();
    String getDescription();

    void execute(SlashCommandInteractionEvent event);
}
