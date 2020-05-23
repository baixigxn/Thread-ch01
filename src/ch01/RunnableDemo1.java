package ch01;

//1,创建类实现Runnable接口，同时实现run方法
//2,在主线程(main函数)中实例化RunnableDemo1对象
//3,实例化线程Thread对象，把RunnableDemo1对象作为形参
//4,调用线程类的start方法，启动线程
public class RunnableDemo1 implements Runnable{

    @Override
    public void run() {
        System.out.println("id:"+Thread.currentThread().getId());
        System.out.println("name:"+Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "sub-thread");
        }
    }
}
