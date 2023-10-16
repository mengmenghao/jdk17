package 第11章.第1题;

import java.util.Comparator;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: SuperMath
 * @createDate: 2023/10/16 16:25
 */
public class SuperMath {
    public static <T> T min(T[] array, Comparator<? super T> comparator){
        T min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], min) < 0) {
                min = array[i];
            }
        }

        System.out.println("最小值: " + min);
        return min;
    }


    public static <T> T max(T[] array, Comparator<? super T> comparator){
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], max) > 0) {
                max = array[i];
            }
        }

        System.out.println("最大值: " + max);
        return max;
    }
}
