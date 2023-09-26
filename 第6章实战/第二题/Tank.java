package 第6章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Tank
 * @createDate: 2023/9/26 19:49
 */
public class Tank extends Weapon implements Mobile{
    @Override
    public void attack() {
        System.out.println("attack--Tank");
    }

    @Override
    public void move() {
        System.out.println("move--Tank");
    }
}
