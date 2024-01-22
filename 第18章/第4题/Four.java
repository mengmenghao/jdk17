package 第18章.第4题;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Four
 * @createDate: 2024/1/22 22:47
 */
public class Four {
    public static void main(String[] args) {
        // 定义一个过去的日期，例如2010年1月1日
        LocalDate pastDate = LocalDate.of(2020, 5, 18);

        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 计算两个日期之间的差值
        Period period = Period.between(pastDate, currentDate);

        System.out.printf("从 %s 到今天已经过去了：%d 年, %d 个月, %d 天%n",
                pastDate,
                period.getYears(),
                period.getMonths(),
                period.getDays());
    }
}
