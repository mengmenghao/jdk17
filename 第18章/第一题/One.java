package 第18章.第一题;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: One
 * @createDate: 2024/1/22 21:45
 */
public class One {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int a = ThreadLocalRandom.current().nextInt(100, 201);
            System.out.println("随机数：" + a);
            if (a%7==0 && a%3!=0) {
                System.out.println(a);
            }
        }

        System.out.println("---------------------------------------");
        for (int i = 0; i < 20; i++) {
            int a = (int) Math.floor(Math.random() * 100 + 100);
            System.out.println("随机数：" + a);
            if (a%7==0 && a%3!=0) {
                System.out.println(a);
            }
        }


        System.out.println("---------------------------------------");
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(100, 201);
            System.out.println("随机数：" + a);
            if (a%7==0 && a%3!=0) {
                System.out.println(a);
            }
        }
    }
}
