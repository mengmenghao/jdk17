package 第10章.第3题;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Person
 * @createDate: 2023/10/11 22:44
 */
public class Person implements Comparable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person person1 = (Person) o;
        int i = name.compareTo(person1.name);

        if (i == 0) {
            return age.compareTo(person1.age);
        }

        return i;
    }

    //static class PersonComparator implements Comparator{
    //
    //    @Override
    //    public int compare(Object o1, Object o2) {
    //        Person person1 = (Person) o1;
    //        Person person2 = (Person) o2;
    //
    //        int i = person1.name.compareTo(person2.name);
    //
    //        if (i==0) {
    //            return person1.age.compareTo(person2.age);
    //        }
    //
    //        return i;
    //    }
    //}
}
