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

        // 改用三元運算子 ?:
        String result2 = (score >= 60) ? "及格" : "不及格";
        System.out.printf("分數: %d %s%n", score, result2);

    }
}
