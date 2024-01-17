package 第17章.第一题;

import java.util.List;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: one
 * @createDate: 2024/1/17 17:02
 */
public class one {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        List<String> number = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26");

        new Thread(new Task(list)).start();
        new Thread(new Task(number)).start();
    }
}

class Task implements Runnable {
    private List<String> list ;

    public Task(List<String> list) {
        this.list=list;
    }

    @Override
    public void run() {
        for (String s : list) {
            System.out.println("线程id" + Thread.currentThread().getName() + "正在执行" + s);
        }
    }
}