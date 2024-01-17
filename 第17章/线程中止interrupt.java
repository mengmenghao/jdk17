package 第17章;

/**
 * @author lmh
 * @description: 在sleep和wait阻塞时调用interrupt方法，会抛出InterruptedException异常
 * @projectName: jdk17
 * @className: 线程中止interrupt
 * @createDate: 2024/1/15 22:52
 */
public class 线程中止interrupt {
    public static void main(String[] args) {
        CleanTask cleanTask = new CleanTask();
        Thread thread = new Thread(cleanTask);
        thread.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}

class CleanTask implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Resource resource = new Resource();
                try {
                    Thread.sleep(1000);
                } finally {
                    resource.close();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("线程中断");
        }
    }
}

class Resource {
    public Resource() {
        System.out.println("Resource init");
    }

    public void close() {
        System.out.println("Resource close");
    }
}
