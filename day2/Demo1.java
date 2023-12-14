/**
 * Java 變數的應用
 * 基本變數 (8大)
 * byte    8bis    -128 ~ +127
 * short   16bits  -32768 ~ +32767
 * int     32bits  -21億 ~ +21億  (整數預設)
 * long    64bits  -900京 ~ +900京
 * float   32bits
 * double  64 bits (浮點數預設)
 * char    16bits  字元/0~65535的數字
 * boolean 1或8 bits(根據 OS) true/false
 * 
 * 參考變數 (基本變數之外)
 * String 字串
 * Integer 
 * Double 
 * ...
 */

 package day2;

 public class Demo1 {
    public static void main(String[] args) {
        int usd = 480000; // 美金帳戶餘額
        double exTWDUSD = 30.25; // 美金兌換台幣的匯率
        // 請問轉換為台幣時帳戶餘額為多少 ?
        double twd = usd * exTWDUSD;
        System.out.println("美金:" + usd + "元");
        System.out.println("匯率:" + exTWDUSD);
        System.out.println("台幣:" + twd + "元");
        System.out.println("台幣:" + String.format("%f", twd) + "元");
        System.out.println("台幣:" + String.format("%.0f", twd) + "元");
        System.out.println("台幣:" + String.format("%.1f", twd) + "元");
        System.out.println("台幣:" + String.format("%,.1f", twd) + "元");
        //---------------------------------------------------------------
        // printf = System.out.print + string format
        System.out.printf("台幣: %,.1f元%n", twd);

        // 利用 printf 印出 "美金: 480,000 匯率: 30.25 台幣: 14,520,000"
        System.out.printf("美金: %d 匯率: %f 台幣: %f%n", usd, exTWDUSD, twd);
        System.out.printf("美金: %,d 匯率: %.2f 台幣: %,.0f%n", usd, exTWDUSD, twd);
    }
 }