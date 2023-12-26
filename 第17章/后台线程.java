package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 后台线程
 * @createDate: 2023/12/26 18:51
 */
public class 后台线程 {
    public static void main(String[] args) {
        //Thread t = new Thread(new DaemonTask(), "后台线程");
        //t.setDaemon(true);
        //t.start();
        //
        //for (int i = 0; i < 10; i++) {
        //    System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
        //    try {
        //        Thread.sleep(200);
        //    } catch (InterruptedException e) {
        //        throw new RuntimeException(e);
        //    }
        //}
        //System.out.println("主线程结束");

        Thread thread = new Thread(new FinallyTask());
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("主线程结束");
    }
}

class DaemonTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class FinallyTask implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("后台线程开始");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }
    }
}