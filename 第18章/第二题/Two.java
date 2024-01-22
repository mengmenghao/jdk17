package 第18章.第二题;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Two
 * @createDate: 2024/1/22 21:54
 */
public class Two {
    public static void main(String[] args) {
        circleArea(2.2);
    }
    public static void circleArea(double radius){
        BigDecimal radiusBD = BigDecimal.valueOf(radius);
        System.out.println("圆的面积为："+radiusBD.multiply(radiusBD).multiply(BigDecimal.valueOf(Math.PI), new MathContext(5, RoundingMode.HALF_UP)));
    }
}
