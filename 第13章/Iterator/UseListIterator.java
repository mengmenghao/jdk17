package 第13章.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: UseListIterator
 * @createDate: 2023/11/5 18:03
 */
public class UseListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(11,22,33,44,55));
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
        System.out.println(listIterator.previousIndex() + " " + listIterator.nextIndex());

        System.out.println(listIterator.next());

        listIterator.add(111);
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

    }
}
