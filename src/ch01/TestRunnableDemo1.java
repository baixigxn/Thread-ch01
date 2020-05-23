package ch01;

public class TestRunnableDemo1 {
    public static void main(String[] args) {
        RunnableDemo1 runnableDemo1 = new RunnableDemo1();
        Thread thread1 = new Thread(runnableDemo1);
        RunnableDemo1 runnableDemo2 = new RunnableDemo1();
        Thread thread2 = new Thread(runnableDemo1);
        thread1.start();
        thread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "main-thread");
        }
    }
}
