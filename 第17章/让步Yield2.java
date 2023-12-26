package 第17章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 让步Yield2
 * @createDate: 2023/12/26 16:25
 */
public class 让步Yield2 {
    public static void main(String[] args) {
        Runnable task = ()->{
            int i = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + " " + i++);
                if (i++ == 100) {
                    Thread.yield();
                    i=0;
                }
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
