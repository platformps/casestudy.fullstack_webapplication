package com.github.curriculeon.utils;

import java.util.logging.Logger;

/**
 * Created by leon on 7/10/2020.
 */
public interface Loggable {
    default Logger getLogger() {
        return Logger.getLogger(getClass().getName());
    }

    default void log(String info, Object... args) {
        getLogger().info(String.format(info, args));
    }
}
