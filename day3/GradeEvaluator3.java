package day3;

import java.util.Scanner;

/**
 * 學生成績評等
 * 90 ~ 100 優秀 A
 * 80 ~ 89 良好 B
 * 70 ~ 79 中等 C
 * 60 ~ 69 及格 D
 * 0 ~ 59 不及格 F
 * 其他分數: 成績錯誤 E
 */
public class GradeEvaluator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入學生成績:");
        int score = scanner.nextInt();
        // 判斷分數範圍是否合法
        if(score < 0 || score > 100) {
            System.out.printf("成績: %d 成績錯誤 E%n", score);
            return;
        }

        String grade = null;
        // 請用 switch-case 來判斷評等
        switch (score/10) {
            case 10:
            case 9:
                grade = "優秀 A";
                break;
            case 8:
                grade = "良好 B";
                break;
            case 7:
                grade = "中等 C";
                break;    
            case 6:
                grade = "及格 D";
                break;
            default:
                grade = "不及格";
        }
        System.out.printf("成績: %d 評等: %s%n", score, grade);
    }
}
