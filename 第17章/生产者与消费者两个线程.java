package 第17章;

import java.util.function.Consumer;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 生产者与消费者两个线程
 * @createDate: 2024/1/4 23:18
 */
public class 生产者与消费者两个线程 {
    public static void main(String[] args) {
        Queue2 queue = new Queue2();
        new Thread(new ProducerTask(queue)).start();
        new Thread(new ConsumerTask(queue)).start();
    }
}
class Queue1 {
    // 数据
    private int data;
    // 判断数据是否被取走的标记变量
    private boolean bFull = false;

    /**
     * 由生产者线程调用的方法，放置数据
     * @param data
     */
    public synchronized void put(int data) {
        // 如果数据还未被取走，则让生产线程等待
        if (bFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 线程被唤醒说明消费者取走了数据，继续放置数据
        this.data = data;
        bFull = true;
        // 唤醒消费者线程，通知他取走数据
        notify();
    }

    /**
     * 由消费者线程调用的方法，取走数据
     * @return
     */
    public synchronized int get() {
        // 如果数据已经被取走，则让消费者线程等待
        if (!bFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 线程被唤醒说明生产者放置了数据，继续取走数据
        bFull = false;
        // 唤醒生产者线程，通知他放置数据
        notify();
        return data;
    }
}

class Queue2 {
    // 数据
    private int data;
    // 判断数据是否被取走的标记变量
    private boolean bFull = false;
    private Object object = new Object();

    /**
     * 由生产者线程调用的方法，放置数据
     * @param data
     */
    public void put(int data) {
        synchronized (object) {
            // 如果数据还未被取走，则让生产线程等待
            if (bFull) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 线程被唤醒说明消费者取走了数据，继续放置数据
            this.data = data;
            bFull = true;
            // 唤醒消费者线程，通知他取走数据
            object.notify();
        }
    }

    /**
     * 由消费者线程调用的方法，取走数据
     * @return
     */
    public int get() {
        synchronized (object) {
            // 如果数据已经被取走，则让消费者线程等待
            if (!bFull) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 线程被唤醒说明生产者放置了数据，继续取走数据
            bFull = false;
            // 唤醒生产者线程，通知他放置数据
            object.notify();
            return data;
        }
    }
}

class ProducerTask implements Runnable {
    private Queue2 queue;
    public ProducerTask(Queue2 queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            queue.put(i);
            System.out.println("Producer put:" + i);
        }
    }
}

class ConsumerTask implements Runnable {
    private Queue2 queue;
    public ConsumerTask(Queue2 queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer get:" + queue.get());
        }
    }
}
