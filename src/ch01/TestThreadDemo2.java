package ch01;

public class TestThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程："+ Thread.currentThread().getName());
        System.out.println("主线程的优先级"+Thread.currentThread().getPriority());
        ThreadDemo2 thread1 = new ThreadDemo2("线程1");
        System.out.println("线程默认优先级"+ thread1.getPriority());
        thread1.start();
        thread1.join(2);
        ThreadDemo2 thread2 = new ThreadDemo2("线程2");
        thread2.start();

    }
}
