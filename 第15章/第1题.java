package 第15章;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 第1题
 * @createDate: 2023/12/25 17:29
 */
public class 第1题 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("第15章.SomeMethod");
        Constructor<?> constructor = aClass.getConstructor();
        Object object = constructor.newInstance();
        Method method = aClass.getMethod("a");
        method.invoke(object);

        method = aClass.getMethod("NeedParams", int.class, int.class);
        method.invoke(object, 1, 2);

        method = aClass.getDeclaredMethod("b");
        method.invoke(object);

        method = aClass.getDeclaredMethod("c");
        method.setAccessible(true);
        method.invoke(object);
    }
}
