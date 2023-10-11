package 第9章实战.第四题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 21:56
 */
public class Client {
    public static void main(String[] args) {
        String str = "Learn java from Sun Xins book";
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedStr.append(reversedWord).append(" ");
        }

        String result = reversedStr.toString().trim();
        System.out.println("翻转后的字符串为: " + result);
    }
}
