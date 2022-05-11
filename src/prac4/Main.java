package prac4;

public class Main {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor(10);
        Thread th1 = new Thread(() -> { //тело потока
            System.out.println("Thread start " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }

            System.out.println("Thread finished " + Thread.currentThread().getName());
        });

        for(int i = 0; i < 10; ++i) {
            myExecutor.submit(th1); //submit - запуск потоков через executor
        }
        myExecutor.shutdown();//остановка executor
    }
}
