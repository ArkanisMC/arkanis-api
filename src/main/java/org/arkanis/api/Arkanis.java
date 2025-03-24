package org.arkanis.api;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public sealed interface Arkanis permits ArkanisImpl {

    static @NotNull Arkanis getImpl() {
        return ArkanisImpl.INSTANCE;
    }

    @ApiStatus.Internal
    static void setImpl(@NotNull Arkanis impl) {
        if(ArkanisImpl.INSTANCE != null)
            throw new IllegalStateException("Arkanis implementation is already set");
        ArkanisImpl.INSTANCE = Objects.requireNonNull(impl, "impl");
    }

}
