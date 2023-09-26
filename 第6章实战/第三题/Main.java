package 第6章实战.第三题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Main
 * @createDate: 2023/9/26 20:24
 */
public class Main {
    public static void main(String[] args) {
        IEngine iEngine = new HONDA();
        Car car = new Car(iEngine);
        car.testEngine();
    }
}
