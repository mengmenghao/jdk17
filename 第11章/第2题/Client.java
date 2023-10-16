package 第11章.第2题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/16 17:17
 */
public class Client {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("队列大小: " + queue.size());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队列大小: " + queue.size());
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println("队列大小: " + queue.size());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队列大小: " + queue.size());
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
        queue.offer(11);
        queue.offer(12);
        System.out.println("队列大小: " + queue.size());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队首元素: " + queue.poll());
        System.out.println("队列大小: " + queue.size());
    }
}
