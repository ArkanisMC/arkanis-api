package org.arkanis.api.guild;

import org.arkanis.api.utils.ChatColor;

public interface IGuildRank {
    void addRank(int power, String name, ChatColor color);
    void removeRank(String name);
}
