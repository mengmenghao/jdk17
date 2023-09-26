package 第6章实战.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Army
 * @createDate: 2023/9/26 19:53
 */
public class Army {
    private Weapon[] w;

    private int l=0;// 代表剩余多少容量

    public Army(int i) {
        this.w = new Weapon[i];
    }


    public void addWeapon(Weapon weapon){
        this.w[l] = weapon;
        this.l++;
    }

    public void attackAll(){
        System.out.println("======attackAll======");
        for (Weapon weapon : w) {
            if (weapon instanceof Assaultable) {
                weapon.attack();
            }
        }
    }


    public void moveAll(){
        System.out.println("======moveAll======");
        for (Weapon weapon : w) {
            if (weapon instanceof Mobile) {
                ((Mobile) weapon).move();
            }
        }
    }
}
