package org.arkanis.api.profile;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IProfileManager {

    @NotNull Map<@NotNull UUID, @NotNull IProfile> getLocalCache();

    @Nullable IProfile getProfile(@NotNull UUID uuid);
    @Nullable IProfile getProfile(@NotNull String name);

    @Unmodifiable Collection<@NotNull IProfile> getProfiles();

    void saveProfile(@NotNull IProfile profile);
    void updateProfile(@NotNull IProfile profile);
    void deleteProfile(@NotNull IProfile profile);
}
