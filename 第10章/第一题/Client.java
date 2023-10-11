package 第10章.第一题;

import java.util.Arrays;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 22:29
 */
public class Client {
    public static void main(String[] args) {
        String str = "hello world";
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        String sortedString = new String(charArray);
        System.out.println(sortedString);
    }
}
