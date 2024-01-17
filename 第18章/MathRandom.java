package 第18章;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MathRandom
 * @createDate: 2024/1/17 22:04
 */
public class MathRandom {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            //double random = Math.random() * 10;
            //System.out.println("0<=z<10:" + random);

            //int floor = (int) Math.floor(Math.random() * 10);
            //System.out.println("0<=z<10整数:" + floor);

            int i1 = 1 + (int) Math.floor(Math.random() * 10);
            if (i1 >= 10) {
                System.out.println("1<=z<=10:" + i1);
            }
        }
    }
}
