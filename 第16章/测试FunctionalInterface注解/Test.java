package 第16章.测试FunctionalInterface注解;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Test
 * @createDate: 2023/12/26 1:19
 */
@FunctionalInterface
public interface Test {
    void test(String str);
    //void test2();
    /**
     * 在 Java 中，@FunctionalInterface 注解用于标识一个接口为函数式接口，即该接口只能有一个抽象方法。
     * 如果在使用 @FunctionalInterface 注解时提示找到了多个非重写 abstract 方法，
     * 说明该接口定义了多个抽象方法，这不符合函数式接口的要求。
     * 为了解决该问题，需要检查函数式接口的定义，确保只有一个抽象方法。
     * 如果有必要，可以重写其他方法或将它们改为非抽象方法。
     * 如果不想修改接口定义，也可以在使用该接口的地方实现其他方法。
     */
}
