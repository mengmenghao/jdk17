package 第17章.第二题;

import java.util.LinkedList;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: two
 * @createDate: 2024/1/17 17:24
 */
public class two {
    public static void main(String[] args) throws InterruptedException {
        Stack stack = new Stack();
        Thread pro = new Thread(new ProductTask(stack));
        Thread cum = new Thread(new ConsumerTask(stack));
        pro.start();
        cum.start();

        pro.join(); // 确保生产者完成任务后再结束主线程
        cum.interrupt(); // 中断消费者线程，防止死循环
    }
}

class Stack {
    private LinkedList<String> list;

    public Stack() {
        this.list = new LinkedList<>();
    }

    public void push(String str) throws InterruptedException {
        list.add(str);
    }

    public String pop() throws InterruptedException {
        if (list.isEmpty()) {
            Thread.sleep(100);
        }
        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class ProductTask implements Runnable {
    private Stack stack;

    public ProductTask(Stack stack) {
        this.stack = stack;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String d = "Producer pushed: " + i;
                stack.push(d);
                System.out.println("Producer pushed: " + i);
                Thread.sleep(100); // 模拟延迟
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ConsumerTask implements Runnable {
    private Stack stack;
    public ConsumerTask(Stack stack) {
        this.stack = stack;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String value = stack.pop();
                if (value == null) {
                    break; // 如果栈已空且无新数据，可以退出循环
                }
                System.out.println("Consumer popped: " + value);
                Thread.sleep(100); // 模拟延迟
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
