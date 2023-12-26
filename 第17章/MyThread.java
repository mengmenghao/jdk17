package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MyThread
 * @createDate: 2023/12/26 0:45
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("我们的线程: " + getName());
    }
}

class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程：" + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
