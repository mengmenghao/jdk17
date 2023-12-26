package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 让步Yield
 * @createDate: 2023/12/26 16:16
 */
public class 让步Yield {
    public static void main(String[] args) {
        Runnable task = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Thread.yield();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
