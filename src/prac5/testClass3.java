package prac5;

// Потокобезопасность, Высокая производительность в многопоточной среде

public class testClass3 {
    private static final testClass3 INSTANCE = new testClass3();
    private testClass3(){
        System.out.println("Hello!");
    }
    public static testClass3 getInstance(){
        return INSTANCE;
    }
}