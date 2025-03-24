package org.arkanis.api;

import lombok.Getter;
import lombok.Setter;

public interface ArkanisImpl {
    static ArkanisImpl getImpl() {
        return Impl.getImplementation();
    }

    static void setImpl(ArkanisImpl impl) {
        Impl.setImplementation(impl);
    }

    class Impl {

        @Getter @Setter
        private static ArkanisImpl implementation;

    }
}
