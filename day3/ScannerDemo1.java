package day3;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入身高:");
        double h = scanner.nextDouble(); // 取得使用者所輸入的資料並轉成 double
        System.out.print("請輸入體重:");
        double w = scanner.nextDouble(); // 取得使用者所輸入的資料並轉成 double
        // 計算 bmi
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f%n", h, w, bmi);
    }
}
