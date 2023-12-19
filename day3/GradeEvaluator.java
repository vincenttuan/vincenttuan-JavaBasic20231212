package day3;

import java.util.Scanner;

/**
 * 學生成績評等
 * 90 ~ 100 優秀 A
 * 80 ~ 89  良好 B
 * 70 ~ 79  中等 C
 * 60 ~ 69  及格 D
 * 0  ~ 59  不及格 F
 * 其他分數: 成績錯誤 E
*/
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入學生成績:");
        int score = scanner.nextInt();
        String grade = "";
        if(score >= 90) {
            grade = "優秀 A";
        } else if(score >= 80) {
            grade = "良好 B";
        } else if(score >= 70) {
            grade = "中等 C";
        } else if(score >= 60) {
            grade = "及格 D";
        } else {
            grade = "不及格 F";
        }
        System.out.printf("成績: %d 評等: %s%n", score, grade);

    }
}
