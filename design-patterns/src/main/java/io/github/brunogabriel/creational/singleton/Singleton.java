package io.github.brunogabriel.creational.singleton;

import com.google.common.annotations.VisibleForTesting;

public class Singleton {
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // double-checked locking
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    @VisibleForTesting
    static synchronized void resetInstance() {
        instance = null;
    }
}
