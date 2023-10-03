package 第8章实战.第二题;

import 第8章实战.第一题.MustStringArgumentException;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/4 0:44
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student("张三");
        student.printName(123);
    }
}
