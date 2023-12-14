package day1;

public class Hello3 {
    public static void main(String[] args) {
        // 整數變數 int, 浮點數變數 double
        int x = 5;
        int y = 7;
        int z = x + y;
        System.out.println(z);

        // lab 假設半徑 int r = 10; 求圓面積 = ?
        int r = 10;
        // 求圓面積(第一種寫法)
        double pi = 3.14;
        double area1 = r * r * pi;
        System.out.println(area1);
        // 求圓面積(第二種寫法)
        double area2 = Math.pow(r, 2) * Math.PI;
        System.out.println(area2);
        System.out.println(Math.PI); // 精確的圓周率
    }
}
