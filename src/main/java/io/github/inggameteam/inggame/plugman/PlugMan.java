package io.github.inggameteam.inggame.plugman;

import io.github.inggameteam.inggame.plugman.util.BukkitCommandWrap;
import io.github.inggameteam.inggame.plugman.util.BukkitCommandWrap_Useless;
import lombok.Getter;

public class PlugMan {

    static {
        try {
            Class.forName("com.mojang.brigadier.CommandDispatcher");
            bukkitCommandWrap = new BukkitCommandWrap();
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            bukkitCommandWrap = new BukkitCommandWrap_Useless();
        }
    }

    @Getter
    public static BukkitCommandWrap bukkitCommandWrap = null;

}
