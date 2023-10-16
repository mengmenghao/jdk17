package 第11章.第2题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MyQueue
 * @createDate: 2023/10/16 16:44
 */
public class MyQueue2<T> {
    private T[] arr;
    private int front;
    private int rear;
    private int capacity;

    public MyQueue2(int size) {
        arr = (T[]) new Object[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    // 添加元素
    public void offer(T item) {
        if (isFull()) {
            System.out.println("队列已满，无法添加元素。");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
    }

    // 获取队首元素
    public T poll() {
        if (isEmpty()) {
            System.out.println("队列为空，无法删除元素。");
            return null;
        }
        T item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

}
