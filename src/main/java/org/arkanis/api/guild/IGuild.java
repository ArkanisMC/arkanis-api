package org.arkanis.api.guild;

import org.arkanis.api.profile.IProfile;
import org.arkanis.api.utils.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface IGuild {
    @NotNull String getName();
    ChatColor getColor();

    IBanner getBanner();
    Map<IProfile, IGuildRank> getRanks();
    int getMaxSize();
}
