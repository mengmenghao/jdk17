package 第10章.第3题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 22:44
 */
public class Client {
    public static void main(String[] args) {

        Person[] personList = new Person[2];
        personList[1] = new Person("A", 24);

        personList[0] = new Person("B", 12);
        //Arrays.sort(personList,new Person.PersonComparator());
        Arrays.sort(personList);
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
