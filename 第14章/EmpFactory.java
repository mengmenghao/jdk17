package 第14章;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: EmpFactory
 * @createDate: 2023/12/21 11:56
 */
public class EmpFactory {
    private static Emp[] emps = new Emp[]{
            new Emp(1001, "张三", 25, "经理", 10000, 5000, "研发部"),
            new Emp(1002, "李四", 28, "总经理", 20000, 10000, "研发部"),
            new Emp(1003, "王五", 30, "部门经理", 15000, 8000, "研发部"),
            new Emp(1004, "赵六", 22, "部门经理", 13000, 7000, "研发部"),
            new Emp(1005, "田七", 25, "部门经理", 12000, 6000, "研发部"),
            new Emp(1006, "周八", 28, "部门经理", 11000, 5000, "研发部"),
            new Emp(1007, "吴九", 30, "部门经理", 10000, 4000, "研发部"),
            new Emp(1008, "郑十", 22, "部门经理", 9000, 3000, "研发部"),
            new Emp(1009, "王十一", 25, "部门经理", 8000, 2000, "研发部")
    };

    public static Emp[] getEmps(){
        return emps;
    }

    public static void main(String[] args) {
        Emp[] emps = EmpFactory.getEmps();
        System.out.println("--------------1-----------------");
        Arrays.stream(emps).filter(o -> o.getAge() > 30)
                .forEach(o->System.out.println(o.getName() + "--" + o.getAge()));
        System.out.println("--------------2-----------------");
        Arrays.stream(emps).map(
                o-> {
                    o.setSalary(o.getSalary() + o.getBonus());
                    return o;
                }
        ).forEach(o->System.out.println(o.getName() + "--" + o.getSalary()));

        System.out.println("---------------3-----------------");
        Arrays.stream(emps).sorted(
                Comparator.comparing(Emp::getSalary)
        ).forEach(o->System.out.println(o.getName() + "--" + o.getSalary()));
        System.out.println("---------------4-----------------");
        Arrays.stream(emps).map(Emp::getSalary)
                .max(Comparator.comparing(Function.identity()))
                .ifPresent(System.out::println);

        System.out.println("---------------4-----------------");
        Arrays.stream(emps).map(Emp::getSalary)
               .min(Comparator.comparing(Function.identity()))
               .ifPresent(System.out::println);
        System.out.println("---------------5-----------------");
        int sum = Arrays.stream(emps).mapToInt(Emp::getSalary).sum();
        System.out.println(sum);
        System.out.println("---------------5-----------------");
        Arrays.stream(emps).mapToInt(Emp::getSalary).average().ifPresent(System.out::println);
        System.out.println("---------------6-----------------");
        IntSummaryStatistics collect = Arrays.stream(emps).map(
                o -> {
                    o.setSalary(o.getSalary() + o.getBonus());
                    return o;
                }
        ).collect(Collectors.summarizingInt(Emp::getSalary));
        System.out.println(collect);
    }
}

class Emp {
    // 编号
    private Integer no;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 职位
    private String job;
    // 薪水
    private Integer salary;

    // 奖金
    private Integer bonus;
    // 部门
    private String dept;

    public Emp(Integer no, String name, Integer age, String job, Integer salary, Integer bonus, String dept) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.bonus = bonus;
        this.dept = dept;
    }

    public String toString(){
        return name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
