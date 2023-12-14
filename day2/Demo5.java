package day2;

public class Demo5 {
    public static void main(String[] args) {
        int score = 75;
        // 判斷是否及格 ?
        String result = "";
        if(score >= 60) {
            result = "及格";
        } else {
            result = "不及格";
        }
        System.out.printf("分數: %d %s%n", score, result);

        // 三元運算子 ?: Lab1 
        String result2 = (score >= 60) ? "及格" : "不及格";
        System.out.printf("分數: %d %s%n", score, result2);

        // 三元運算子 ?: Lab2
        // 若總購物金額超過(含) 1000 元打九折, 超過(含) 5000 元打8折, 未滿 1000 打 95折
        int amount = 3000; // 購物金額
        double discount = (amount >= 5000) ? 0.8 : (amount < 1000) ? 0.95 : 0.9; // 折數
        System.out.printf("付款金額: %,.0f%n", amount * discount);




    }
}
