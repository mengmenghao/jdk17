package 第15章;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 第2题
 * @createDate: 2023/12/25 18:03
 */
public class 第2题 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("第15章.ExampleClass");
        Constructor<?> constructor = aClass.getConstructor();

        Object object = constructor.newInstance();

        Field str = aClass.getField("str");
        str.set(object, "hello world");

        Field num = aClass.getField("num");
        num.set(object, 123);

        System.out.println(object);
    }
}
