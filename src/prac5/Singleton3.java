package prac5;

public enum Singleton3 {
    INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}