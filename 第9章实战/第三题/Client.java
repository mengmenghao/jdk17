package 第9章实战.第三题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 21:47
 */
public class Client {
    public static void main(String[] args) {
        String str = "title=Vue.js从入门到实战 author=孙鑫";
        String[] parts = str.split("=");

        String title = parts[1].split(" ")[0];
        String author = parts[2];

        System.out.println("拆分后的字符串为: " + title + " " + author);
    }
}
