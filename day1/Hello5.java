package day1;

public class Hello5 {
    
    public static void main(String[] args) {
        // 小明是一位25歲的男性，身高175公分，體重70公斤。
        // 他的活動水平是輕度，請計算他的BMR（基礎代謝率）。
        // Mifflin-St Jeor 公式:
        // 男性：BMR = (10 × 體重公斤) + (6.25 × 身高公分) - (5 × 年齡歲) + 5（輕度活動水平）
        // 女性：BMR = (10 × 體重公斤) + (6.25 × 身高公分) - (5 × 年齡歲) - 161（輕度活動水平）
        double h = 175;
        double w = 70;
        int age = 25;
        double bmr = (10 * w) + (6.25 * h) - (5 * age) + 5;
        System.out.println(bmr + "卡路里");
    }

}
