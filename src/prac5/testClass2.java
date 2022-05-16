package prac5;

//Ленивая инициализация., Не потокобезопасно

public class testClass2 {
    private static testClass2 INSTANCE = new testClass2();
    private testClass2(){
        System.out.println("Hello!");
    }
    public static testClass2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new testClass2();
        }
        return INSTANCE;
    }
}
