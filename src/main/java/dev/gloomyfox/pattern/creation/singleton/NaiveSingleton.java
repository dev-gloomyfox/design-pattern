package dev.gloomyfox.pattern.creation.singleton;

public class NaiveSingleton {

    private static NaiveSingleton INSTANCE;

    private NaiveSingleton() {

    }

    public static NaiveSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new NaiveSingleton();
        }

        return INSTANCE;
    }
}
