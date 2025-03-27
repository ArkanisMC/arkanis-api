package org.arkanis.api.guild;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IBanner {
    @NotNull List<String> getPatterns();
    void addPattern(@NotNull String... pattern);
}
