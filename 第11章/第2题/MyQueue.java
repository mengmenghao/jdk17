package 第11章.第2题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MyQueue
 * @createDate: 2023/10/16 16:44
 */
public class MyQueue<T> {
    private T[] arr;
    private int front;
    private int rear;
    // 最大个数
    private int capacity;
    private int size;

    public MyQueue(int size) {
        arr = (T[]) new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        this.size = 0;
    }

    // 添加元素
    public void offer(T item) {
        if (isFull()) {
            System.out.println("队列已满，无法添加元素。");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    // 获取队首元素
    public T poll() {
        if (isEmpty()) {
            System.out.println("队列为空，无法删除元素。");
            return null;
        }
        T item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

}
