package 第10章.第4题;

import java.util.Arrays;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 23:09
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        String[] str = new String[]{"222","2233","dds","aa"};
        user.setInterests(str);

        User clone = (User) user.clone();

        System.out.println(user.getInterests());
        System.out.println(clone.getInterests());

        System.out.println(Arrays.toString(user.getInterests()));
        System.out.println(Arrays.toString(clone.getInterests()));
    }
}
