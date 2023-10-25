package 第12章.第1题;

import java.util.function.BinaryOperator;

/**
 * @author lmh
 * @description: 函数式接口
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/25 21:32
 */
public class Client {
    public static void main(String[] args) {
        // 加
        System.out.println(calculate(1, 2, Integer::sum));
        // -
        System.out.println(calculate(1, 2, (a, b) -> a - b));
        // *
        System.out.println(calculate(1, 2, (a, b) -> a * b));
        // /
        System.out.println(calculate(1, 2, (a, b) -> a / b));
    }

    public static int calculate(int a, int b, BinaryOperator<Integer> operator) {
        return operator.apply(a, b);
    }
}
