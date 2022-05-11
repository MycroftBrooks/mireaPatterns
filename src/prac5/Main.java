package prac5;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton1Another = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton2Another = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.INSTANCE;
        Singleton3 singleton3Another = Singleton3.INSTANCE;

        System.out.println("Singleton 1 hashes");

        int var10001 = singleton1.hashCode();
        System.out.println(var10001 + " " + singleton1Another.hashCode() + " " + singleton1.equals(singleton1Another) + "\n");
        System.out.println("Singleton 2 hashes");
        var10001 = singleton2.hashCode();
        System.out.println(var10001 + " " + singleton2Another.hashCode() + " " + singleton2.equals(singleton2Another) + "\n");
        System.out.println("Singleton 3 hashes");
        var10001 = singleton3.hashCode();
        System.out.println(var10001 + " " + singleton3Another.hashCode() + " " + singleton3.equals(singleton3Another) + "\n");
    }
}
