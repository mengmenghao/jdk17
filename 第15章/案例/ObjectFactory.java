package 第15章.案例;

import 第15章.ExampleClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: ObjectFactory
 * @createDate: 2023/12/21 22:11
 */
public class ObjectFactory {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(1);
        }

        try {
            Class<?> clazz = Class.forName(args[0]);
            Constructor<?> noArgCons = clazz.getConstructor();
            Object instance = noArgCons.newInstance();
            System.out.println("---------clz------------");
            System.out.println(clazz);
            System.out.println("---------obj------------");
            System.out.println(instance);

            Class<?> aClass = Class.forName("第15章.ExampleClass");
            Constructor<?> noArgCons1 = aClass.getConstructor();
            Object instance1 = noArgCons1.newInstance();
            Field str = aClass.getField("str");
            str.set(instance1, "hello world");

            Field num = aClass.getField("num");
            num.set(instance1, 123);
            System.out.println(instance1);

            Field exampleClass = clazz.getDeclaredField("exampleClass");
            exampleClass.setAccessible(true);
            exampleClass.set(instance, instance1);
            System.out.println("---------obj------------");
            System.out.println(instance);

            if (args.length > 1) {
                Class<? extends String> paramClz = args[1].getClass();
                Constructor<?> oneArgCons = clazz.getConstructor(paramClz);
                Object instance2 = oneArgCons.newInstance(args[1]);
                System.out.println("----------------有参数---------");
                System.out.println(instance2);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person {
    private String name;

    private ExampleClass exampleClass;

    public Person(){
        this("匿名");
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ExampleClass getExampleClass() {
        return exampleClass;
    }

    public void setExampleClass(ExampleClass exampleClass) {
        this.exampleClass = exampleClass;
    }

    public void run(int meters) {
        System.out.printf("%s跑了%d米%n",name,meters);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", exampleClass=" + exampleClass +
                '}';
    }

    private void helper() {
        System.out.println("私有的辅助方法");
    }
}
