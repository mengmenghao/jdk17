package 第7章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Army
 * @createDate: 2023/10/3 23:37
 */
public class Army {
    public static void attack(Weapon weapon) {
        weapon.shoot();
    }

    public static Weapon getWeapon(String str){
        return new Weapon() {
            @Override
            public void shoot() {
                System.out.println(str + "射击");
            }
        };
    }
}
