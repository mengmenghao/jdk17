package 第17章;

/**
 * @author lmh
 * @description: 在主线程中捕获不到另一个线程抛出的异常，使用setUncaughtExceptionHandler捕获异常
 * @projectName: jdk17
 * @className: 捕获线程异常
 * @createDate: 2023/12/26 17:38
 */
public class 捕获线程异常 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThrowTask());
        //try {
        //    thread.start();
        //} catch (Exception e) {
        //    System.out.println("Catch it!");
        //}
        thread.setUncaughtExceptionHandler((t,e) -> System.out.println("Catch it!"));
        thread.start();
    }
}

class ThrowTask implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException("抛出一个异常");
    }
}
