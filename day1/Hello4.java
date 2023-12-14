package day1;

public class Hello4 {
    public static void main(String[] args) {
        // 小明身高 170 公分, 體重 60 公斤, 求 bmi 指數 = ?
        double h = 170;
        double w = 60;
        h = h / 100;
        double bmi = w / Math.pow(h, 2);
        System.out.println(bmi);
    }
}
