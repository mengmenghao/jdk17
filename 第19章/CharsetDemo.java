package 第19章;

import java.nio.charset.Charset;
import java.util.SortedMap;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: CharsetDemo
 * @createDate: 2024/2/20 23:20
 */
public class CharsetDemo {
    public static void main(String[] args) {
        SortedMap<String, Charset> sortedMap = Charset.availableCharsets();
        sortedMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
