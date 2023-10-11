package 第9章实战.第二题;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 21:32
 */
public class Client {
    public static void main(String[] args) {
        String str = "abchelloabc";
        String reg = "abc";
        int lastIndex = 0;
        int count1 = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(reg, lastIndex);

            if (lastIndex != -1) {
                count1++;
                lastIndex += reg.length();
            }
        }

        System.out.println("子字符串出现的次数为: " + count1);


        // 正则表达式方式
        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
