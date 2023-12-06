package 第13章.第2题;

import 第11章.第2题.MyQueue;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Queue
 * @createDate: 2023/12/6 21:21
 */
public class Queue implements Iterable<Integer>{
    private ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int element) {
        queue.add(element);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(queue.size() - 1);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        for (Integer num : queue) {
            System.out.println(num);
        }

        int dequeue1 = queue.dequeue();
        System.out.println(dequeue1);
        for (Integer num : queue) {
            System.out.println(num);
        }
        int dequeue = queue.dequeue();
        System.out.println(dequeue);
        for (Integer num : queue) {
            System.out.println(num);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return queue.iterator();
    }
}
