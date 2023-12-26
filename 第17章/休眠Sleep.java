package 第17章;


import java.util.concurrent.TimeUnit;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 休眠Sleep
 * @createDate: 2023/12/26 16:38
 */
public class 休眠Sleep {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " :" + i);
            }
        };
        new Thread(task).start();
        System.out.println("aaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " :" + i);
        }
    }
}
