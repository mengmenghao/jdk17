package 第6章实战.第三题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: YAMAHA
 * @createDate: 2023/9/26 20:18
 */
public class YAMAHA implements IEngine{
    @Override
    public void start() {
        System.out.println("YAMAHA 启动，速度60");
    }

    @Override
    public void stop() {
        System.out.println("YAMAHA 停止，速度0");
    }

    @Override
    public void speedup() {
        System.out.println("YAMAHA 加速，速度80");
    }
}
