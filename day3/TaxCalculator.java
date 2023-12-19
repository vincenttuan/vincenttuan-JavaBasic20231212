package day3;

import java.util.Scanner;

/**
案例 1: 計算稅金
描述:
寫一個 Java 程式來計算年收入的稅金。假設稅金計算如下：
若年收入小於或等於 540,000 元，稅率為 5%。
若年收入超過 540,000 且小於或等於 1,210,000 元，稅率為 12%。
若年收入超過 1,210,000 元，稅率為 20%。
使用者輸入收入之後可以得到應負稅額為多少 ?
例如: 輸入: 300000
      稅率: 5% 稅額: 15000
*/
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入年收入:");
        double income = scanner.nextDouble();
        double rate = 0;
        double tax = 0;
        if(income <= 540_000) {
            rate = 0.05;
        } else if(income <= 1_210_000) {
            rate = 0.12;
        } else {
            rate = 0.2;
        }
        tax = income * rate;
        System.out.printf("年收入: %,.2f 稅率: %.2f%% 稅金: %,.2f%n", income, rate, tax);
    }
}
