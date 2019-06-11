package dev.gloomyfox.pattern.creation.singleton;

public class DCLSingleton {

    private static DCLSingleton INSTANCE;

    private DCLSingleton() {

    }

    public static DCLSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (DCLSingleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DCLSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
