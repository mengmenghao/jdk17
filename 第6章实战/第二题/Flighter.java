package 第6章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Flighter
 * @createDate: 2023/9/26 19:50
 */
public class Flighter extends Weapon implements Mobile{
    @Override
    public void attack() {
        System.out.println("attack--Flighter");
    }

    @Override
    public void move() {
        System.out.println("move--Flighter");
    }
}
