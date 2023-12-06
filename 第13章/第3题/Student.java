package 第13章.第3题;

import java.util.HashSet;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Student
 * @createDate: 2023/12/6 21:31
 */
public class Student {
    public HashSet<Course> courses = new HashSet<>();

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(String name) {
        courses.removeIf(course -> course.getName().equals(name));
    }
}
