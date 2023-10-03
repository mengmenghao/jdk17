package 第8章实战.第二题;

import 第8章实战.第一题.MustStringArgumentException;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Student
 * @createDate: 2023/10/4 0:43
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName(Object greeting){
        if (greeting instanceof String) {
            System.out.println(greeting + name);
        } else {
            throw new MustStringArgumentException("greeting不是字符串");
        }
    }
}
