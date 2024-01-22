package 第18章.第三题;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Three
 * @createDate: 2024/1/22 22:21
 */
public class Three {
    public static void main(String[] args) throws ParseException {
        // 定义一个过去的日期字符串，例如"2010-01-01"
        String pastDateString = "2020-05-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 解析过去的日期
        Date pastDate = sdf.parse(pastDateString);

        // 获取当前日期
        Date currentDate = new Date();

        // 将两个日期转换为Calendar对象以进行计算
        Calendar pastCal = Calendar.getInstance();
        pastCal.setTime(pastDate);
        Calendar currentCal = Calendar.getInstance();
        currentCal.setTime(currentDate);

        // 计算年、月、日差值
        int years = currentCal.get(Calendar.YEAR) - pastCal.get(Calendar.YEAR);
        int months = currentCal.get(Calendar.MONTH) - pastCal.get(Calendar.MONTH);
        int days = currentCal.get(Calendar.DAY_OF_MONTH) - pastCal.get(Calendar.DAY_OF_MONTH);

        // 考虑月份和年份跨越的情况
        if (days < 0) {
            months--;
            pastCal.add(Calendar.MONTH, 1);
            days = currentCal.getActualMaximum(Calendar.DAY_OF_MONTH) + days;
        }
        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.printf("从 %s 到今天已经过去了：%d 年, %d 个月, %d 天%n",
                pastDateString,
                years,
                months,
                days);
    }
}
