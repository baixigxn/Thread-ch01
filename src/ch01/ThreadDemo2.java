package ch01;

public class ThreadDemo2 extends  Thread {
    private String name;
    ThreadDemo2(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("当前线程的名称：" + this.getName());
        this.setName(this.name);
        System.out.println("修改后的线程名称："+this.getName());

        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+"--"+i + "sub_thread");
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
