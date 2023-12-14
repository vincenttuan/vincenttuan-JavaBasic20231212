package day2;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // 資料的輸入
        // 1. 建立 Scanner 物件(輸入輸出)
        Scanner scanner = new Scanner(System.in); // System.in: 系統輸入(預設: 鍵盤)
        // 2. 輸入身高
        System.out.print("請輸入身高: ");
        double h = scanner.nextDouble();// 得到身高
        // 3. 輸入體重
        System.out.print("請輸入體重: ");
        double w = scanner.nextDouble();// 得到體重
        // 4. 計算 BMI
        double bmi = w / Math.pow(h/100, 2); 
        // 5. 請診斷 BMI 值 (過輕? 正常? 過重?)
        // 過輕 bmi < 18
        // 正常 18 <= bmi < 23 
        // 過重 bmi >= 23 
        String result = "正常";
        if(bmi < 18) {
            result = "過輕";
        } else if(bmi >= 23) {
            result = "過重";
        }
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f 診斷: %s%n", h, w, bmi, result);
        
    }
}
