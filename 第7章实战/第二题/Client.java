package 第7章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/3 23:43
 */
public class Client {
    public static void main(String[] args) {
        Weapon weapon = Army.getWeapon("手枪");

        Army.attack(weapon);
    }
}
