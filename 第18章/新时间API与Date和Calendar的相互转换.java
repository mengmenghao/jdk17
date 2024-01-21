package 第18章;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 新时间API与Date和Calendar的相互转换
 * @createDate: 2024/1/21 22:53
 */
public class 新时间API与Date和Calendar的相互转换 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Date d = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(d);

        LocalDateTime ldt = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        System.out.println(ldt);

        Calendar cal = GregorianCalendar.from(now.atZone(ZoneId.systemDefault()));
        System.out.println(cal.getTime());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);
    }
}
