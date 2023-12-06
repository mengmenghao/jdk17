package 第13章.第3题;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: SchoolClass
 * @createDate: 2023/12/6 21:37
 */
public class SchoolClass {
    private HashSet<Student> students;

    public SchoolClass() {
        students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(s -> s.getName().equals(name));
    }

    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();
        Student student = new Student("1");
        Student student2 = new Student("2");
        Student student3 = new Student("3");
        Student student4 = new Student("4");
        Student student5 = new Student("5");

        schoolClass.addStudent(student);
        schoolClass.addStudent(student2);
        schoolClass.addStudent(student3);
        schoolClass.addStudent(student4);
        schoolClass.addStudent(student5);

        student.addCourse(new Course("语文"));
        student.addCourse(new Course("数学"));
        student.addCourse(new Course("英语"));
        student.addCourse(new Course("物理"));
        student.addCourse(new Course("化学"));

        student2.addCourse(new Course("英语"));
        student2.addCourse(new Course("物理"));
        student2.addCourse(new Course("化学"));

        student3.addCourse(new Course("化学"));
        student3.addCourse(new Course("语文"));
        student3.addCourse(new Course("数学"));

        student4.addCourse(new Course("数学"));

        student5.addCourse(new Course("英语"));

        HashMap<String, Integer> hashMap = new HashMap<>();
        // 统计每门课程选课人生
        for (Student student1 : schoolClass.students) {
            for (Course cours : student1.courses) {
                hashMap.put(cours.getName(), hashMap.getOrDefault(cours.getName(), 0) + 1);
            }
        }


        System.out.println(hashMap);
    }
}
