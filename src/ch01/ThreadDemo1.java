package ch01;

//1,创建一个类继承Thread类，同时重写run方法
//2,在主线程(main函数)中实例化线程类,调用start方法
public class ThreadDemo1 extends Thread {
    public void run() {

        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getPriority());
        System.out.println(this.isAlive());


        for (int i = 0; i < 100; i++) {
            System.out.println(i + "sub-thread");
        }
    }
}
