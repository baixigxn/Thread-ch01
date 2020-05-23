package ch01;

public class TestThreadDemo1 {

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();//新建状态
        threadDemo1.setName("线程1");
        threadDemo1.start();//就绪状态

        ThreadDemo1 threadDemo2 = new ThreadDemo1();//新建状态
        threadDemo2.setName("线程2");
        threadDemo2.start();//就绪状态

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "main-thread");
        }
    }
}
