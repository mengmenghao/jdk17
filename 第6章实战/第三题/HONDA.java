package 第6章实战.第三题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: HONDA
 * @createDate: 2023/9/26 20:21
 */
public class HONDA implements IEngine{
    @Override
    public void start() {
        System.out.println("HONDA 启动，速度40");
    }

    @Override
    public void stop() {
        System.out.println("HONDA 停止，速度0");
    }

    @Override
    public void speedup() {
        System.out.println("HONDA 加速，速度120");
    }
}
