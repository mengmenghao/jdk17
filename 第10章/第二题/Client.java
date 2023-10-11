package 第10章.第二题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/11 22:30
 */
public class Client {
    public static void main(String[] args) {
        Integer number = 1964;
        int temp = number;
        int length = String.valueOf(number).length();
        int[] digits = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.println("Digits in the number " + number + ":");


        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 5) % 10;
        }

        digits[0] = digits[0] ^ digits[3];
        digits[3] = digits[0] ^ digits[3];
        digits[0] = digits[0] ^ digits[3];


        digits[2] = digits[2] ^ digits[1];
        digits[1] = digits[2] ^ digits[1];
        digits[2] = digits[2] ^ digits[1];

        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
