package 第11章.第1题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/16 16:40
 */
public class Client {
    public static void main(String[] args) {
        Integer[] intArray = { 5, 10, 2, 8, 3 };
        System.out.println(SuperMath.max(intArray, Integer::compareTo));;

        Double[] doubleArray = { 3.14, 1.618, 2.718, 0.577 };
        System.out.println(SuperMath.min(doubleArray, Double::compareTo));;

        String[] stringArray = { "apple", "banana", "orange" };
        System.out.println(SuperMath.max(stringArray, String::compareTo));;
    }
}
