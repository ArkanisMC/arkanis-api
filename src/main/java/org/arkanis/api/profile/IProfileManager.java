package org.arkanis.api.profile;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IProfileManager {
    Map<UUID, IProfile> getLocalCache();

    IProfile getProfile(UUID uuid);
    IProfile getProfile(String name);

    List<IProfile> getProfiles();

    void saveProfile(IProfile profile);
    void updateProfile(IProfile profile);
    void deleteProfile(IProfile profile);
}
