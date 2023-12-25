package 第15章;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: SomeMethod
 * @createDate: 2023/12/25 17:28
 */
public class SomeMethod {
    public void a() {
        System.out.println("Invoke Method a();");
    }

    public void NeedParams(int a, int b) {
        System.out.println("a:" + a + ",b:" + b);
    }

    protected void b() {
        System.out.println("Invoke Method b();");
    }

    private void c() {
        System.out.println("Invoke Method c();");
    }


}
