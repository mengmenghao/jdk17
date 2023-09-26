package 第6章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Main
 * @createDate: 2023/9/26 20:08
 */
public class Main {
    public static void main(String[] args) {
        Army army = new Army(4);

        Weapon tank = new Tank();
        army.addWeapon(tank);
        Weapon tank2 = new Tank();
        army.addWeapon(tank2);

        Weapon missileTurret = new MissileTurret();
        army.addWeapon(missileTurret);

        Weapon flighter = new Flighter();
        army.addWeapon(flighter);


        army.attackAll();
        army.moveAll();
    }
}
