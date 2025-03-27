package org.arkanis.api.server;

import org.arkanis.api.profile.IProfile;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IServer {
    @NotNull int getId();
    @NotNull String getName();

    String getTemplate();
    List<IProfile> getProfiles();
}
