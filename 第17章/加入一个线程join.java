package 第17章;

/**
 * @author lmh
 * @description: join另一个线程后，会等待另一个线程执行完毕后再继续执行
 * @projectName: jdk17
 * @className: 加入一个线程join
 * @createDate: 2023/12/26 17:04
 */
public class 加入一个线程join {
    public static void main(String[] args) throws InterruptedException {
        SumTask sumTask = new SumTask();
        Thread t = new Thread(sumTask);

        t.start();
        System.out.println("主线程开始等待，等待线程t执行完毕");

        t.join();
        System.out.println("1加到100的结果是：" + sumTask.getSum());
    }
}

class SumTask implements Runnable {
    private int sum;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("从1加到100的任务执行完毕");
    }

    public int getSum() {
        return sum;
    }
}
