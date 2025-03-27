package org.arkanis.api.server;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IServerManager {
    void registerServer(@NotNull String name, @NotNull String template);
    void unregisterServer(String name);

    @NotNull IServer getServer(String name);
    List<IServer> getServersInCache();
}
