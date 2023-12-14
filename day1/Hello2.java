package day1;

public class Hello2 {
    public static void main(String[] args) {
        System.out.println(5+2); // 加法 = 7
        System.out.println(5-2); // 減法 = 3
        System.out.println(5*2); // 乘法 = 10
        System.out.println(5/2); // 整數除法 = 2
        System.out.println(5/2.0); // 浮點數除法 = 2.5
        System.out.println(5%2); // 求餘數 = 1
        System.out.println(5*5); // 5的平方
        System.out.println(5*5*5); // 5的3次方
        // Lab 請寫出 2 的 5 次方 = ?
        System.out.println(2*2*2*2*2); // 2 的 5 次方
        System.out.println(Math.pow(2, 5)); // 2 的 5 次方
        
        System.out.println(Math.pow(170/100, 2));   // 170/100 = 1, 1 的 2 次方 = 1
        System.out.println(Math.pow(170/100.0, 2)); // 170/100.0 = 1.7, 1.7 的 2 次方 = 2.89
    }
}
