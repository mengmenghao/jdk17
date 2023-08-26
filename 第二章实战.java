/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: 第二章实战
 * @createDate: 2023/8/26 13:20
 */
public class 第二章实战 {
    public static void main(String[] args) {
        twelve(5);
    }

    /**
     * 第一题
     */
    public static void one() {
        int number = 110;
        System.out.println(Integer.toBinaryString(number));

        number = number & ~(1 << 3);
        System.out.println(Integer.toBinaryString(number));
        number = number & ~(1 << 4);
        System.out.println(Integer.toBinaryString(number));
        number = number & ~(1 << 5);
        System.out.println(Integer.toBinaryString(number));
        number = number & ~(1 << 6);
        System.out.println(number);
        System.out.println(Integer.toBinaryString(number));
    }

    public static void two() {
        int a = 10, b = 16;
        if (a < b) {
            System.out.println(b + "," + a);
        } else {
            System.out.println(a + "," + b);
        }
    }

    public static void three() {
        int a = 10, b = 16,c=11;
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + ", " + b + ", " + c);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }
    }

    public static void four(int year){

        if (year%4==0&&year%100!=0) {
            System.out.println("闰年");
            return;
        }

        if (year%400==0) {
            System.out.println("闰年");
            return;
        }
        System.out.println("不是闰年");
    }


    public static void five(String fraction) {
        String a = switch (fraction) {
            case "A"-> {
                yield "90-100";
            }
            case "B"-> {
                yield "80-89";
            }
            case "C"-> {
                yield "70-79";
            }
            case "D"-> {
                yield "60-69";
            }
            case "E"-> {
                yield "60以下";
            }
            default -> {
                yield "错误";
            }
        };

        System.out.println(a);

    }


    public static void six(){
        int i=1;
        int total = 0;
        while (i<=99) {
            total+=i;
            i+=1;
        }
        System.out.println(total);

        i=0;
        total=0;
        do {
            i+=1;
            total+=i;
        } while (i<99);
        System.out.println(total);
    }

    public static void seven(){
        for (int i = 100; i <= 200; i++) {
            if (i%3!=0) {
                System.out.println(i);
            }
        }
    }

    public static void eight(){
        int j=0;
        for (int i = 0; i < 200; i++) {
            if (i%7==0&&i%4!=0) {
                System.out.print(i+"  ");
                j++;
                if (j==6) {
                    System.out.println();
                    j=0;
                }
            }
        }
    }


    public static void nine(){
        System.out.println("1-100之间的素数：");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // 判断一个数是否为素数
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void ten(){
        int number = 5; // 要求阶乘的整数
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);
    }

    public static void eleven(){
        int count = 40; // 需要输出的斐波那契数列数量
        System.out.println("斐波那契数列前 " + count + " 个数字为：");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void twelve(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(i*2-1));
        }
    }
}