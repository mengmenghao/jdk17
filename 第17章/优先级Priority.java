package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 优先级Priority
 * @createDate: 2023/12/26 16:53
 */
public class 优先级Priority {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        System.out.println("111");
    }
}
