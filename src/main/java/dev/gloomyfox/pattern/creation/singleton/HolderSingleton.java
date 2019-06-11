package dev.gloomyfox.pattern.creation.singleton;

public class HolderSingleton {

    private HolderSingleton() {

    }

    private static class Holder {
        public static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
