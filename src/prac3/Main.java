package prac3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> syncList = new MyList<>();


        Thread th1 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                syncList.add(i);
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                syncList.add(i);
            }
        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(syncList);
        System.out.println(syncList.size());
    }
}
