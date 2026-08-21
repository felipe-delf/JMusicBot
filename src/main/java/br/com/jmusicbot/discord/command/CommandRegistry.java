package br.com.jmusicbot.discord.command;


import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CommandRegistry{

    private final Map<String, ISlashCommand> commandMap;

    public CommandRegistry(List<ISlashCommand> commands) {
        Map<String, ISlashCommand> commandMap = new HashMap<>();
        for (ISlashCommand command : commands) {
            commandMap.put(command.getName(), command);
        }
        this.commandMap = commandMap;
    }

    public void findCommand(String name){
        String commandName = name.toLowerCase();
        ISlashCommand command = this.commandMap.get(commandName);

    }


}