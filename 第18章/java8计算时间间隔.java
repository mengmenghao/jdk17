package 第18章;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: java8计算时间间隔
 * @createDate: 2024/1/19 23:25
 */
public class java8计算时间间隔 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 1, 17);
        LocalDate now = LocalDate.now();
        Period between = Period.between(localDate, now);
        System.out.println(between.getDays());

        LocalTime localTime = LocalTime.of(23, 28, 0);
        LocalTime nowTime = LocalTime.now();
        Duration between1 = Duration.between(localTime, nowTime);
        System.out.println(between1.getSeconds() + "纳秒-" + between1.getNano());
        System.out.println(between1.toNanos());
    }
}
