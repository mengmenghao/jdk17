package 第6章实战.第三题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Car
 * @createDate: 2023/9/26 20:23
 */
public class Car {
    private IEngine iEngine;

    public Car(IEngine iEngine) {
        this.iEngine = iEngine;
    }

    public void testEngine(){
        iEngine.start();
        iEngine.stop();
        iEngine.speedup();
    }
}
