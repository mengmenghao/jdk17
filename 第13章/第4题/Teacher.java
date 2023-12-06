package 第13章.第4题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Teacher
 * @createDate: 2023/12/6 21:55
 */
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private int salary;

    public Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            if (this.salary > o.salary) {
                return 1;
            } else if (this.salary < o.salary) {
                return -1;
            }
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Teacher> set = new HashSet<>();
        set.add(new Teacher("张三", 20, 10000));
        set.add(new Teacher("张三", 20, 55));
        set.add(new Teacher("李四", 201, 10000));
        set.add(new Teacher("王五", 1, 10000));
        set.add(new Teacher("安安", 20, 11111));
        set.add(new Teacher("心心", 23, 10000));

        System.out.println(Arrays.toString(set.toArray()));


        TreeSet<Teacher> treeSet = new TreeSet<>();
        treeSet.add(new Teacher("张三", 20, 10000));
        treeSet.add(new Teacher("张三", 20, 55));
        treeSet.add(new Teacher("李四", 201, 10000));
        treeSet.add(new Teacher("王五", 1, 10000));
        treeSet.add(new Teacher("安安", 20, 11111));
        treeSet.add(new Teacher("心心", 23, 10000));

        System.out.println(Arrays.toString(treeSet.toArray()));

    }
}
