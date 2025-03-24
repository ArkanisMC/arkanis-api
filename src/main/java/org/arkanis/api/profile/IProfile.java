package org.arkanis.api.profile;

import java.util.Arrays;
import java.util.UUID;

public interface IProfile {
    UUID getId();
    String getName();

    int getCoins();
    int getCredits();

    int getLevel();
    double getXP();

    void sendMessage(String message);
    default void sendMessage(String... messages) {
        Arrays.stream(messages).forEach(this::sendMessage);
    }
}
