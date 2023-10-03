package 第8章实战.第一题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: MustStringArgumentException
 * @createDate: 2023/10/4 0:42
 */
public class MustStringArgumentException extends RuntimeException{
    public MustStringArgumentException() {
    }

    public MustStringArgumentException(String message) {
        super(message);
    }
}
