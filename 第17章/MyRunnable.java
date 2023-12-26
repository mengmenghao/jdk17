package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MyRunnable
 * @createDate: 2023/12/26 1:10
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " says: hi...");
    }
}

class ThreadRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < 5; i++) {
            new Thread(myRunnable).start();
        }
        System.out.println(Thread.currentThread().getName() + " 准备结束");

        Runnable runnable = ()-> System.out.println(Thread.currentThread().getName() + "  says :hi ...lambda");
        for (int i = 0; i < 5; i++) {
            new Thread(runnable).start();
        }
        System.out.println(Thread.currentThread().getName() + " 准备结束");
    }
}
