package org.arkanis.api.profile;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.UUID;

public interface IProfile {

    @NotNull UUID getId();
    @NotNull String getName();

    int getCoins();
    int getCredits();

    int getLevel();
    double getXP();

    void sendMessage(@NotNull String first, @NotNull String... extra);

}
