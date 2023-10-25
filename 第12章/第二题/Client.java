package 第12章.第二题;

import java.util.ArrayList;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/25 21:38
 */
public class Client {
    public static void main(String[] args) {
        SuperMapperList<Integer> superMapperList = new SuperMapperList<>();
        for (int i = 1; i <= 5; i++) {
            superMapperList.add(i);
        }

        System.out.println(superMapperList.map(a -> "String" + a));
    }
}

class SuperMapperList<T> extends ArrayList<T> {
    public <U> SuperMapperList<U> map(SuperMapper<T, U> mapper) {
        SuperMapperList<U> list = new SuperMapperList<>();
        for (T val : this) {
            list.add(mapper.map(val));
        }
        return list;
    }
}

