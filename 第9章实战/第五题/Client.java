package 第9章实战.第五题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 22:01
 */
public class Client {
    public static void main(String[] args) {
        String mobileNumber = "12345678901"; // 替换为要验证的手机号
        String regexMobile = "^1[3456789]\\d{9}$";
        boolean isMobileValid = mobileNumber.matches(regexMobile);
        System.out.println("手机号验证结果：" + isMobileValid);

        String landlineNumber = "010-12345678"; // 替换为要验证的座机号
        String regexLandline = "^0\\d{2,3}-\\d{7,8}$";
        boolean isLandlineValid = landlineNumber.matches(regexLandline);
        System.out.println("座机号验证结果：" + isLandlineValid);
    }
}
