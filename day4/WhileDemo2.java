package day4;

import java.util.Random;

public class WhileDemo2 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100); // 0~99 的隨機數
            // 若 number < 50 不要印出
            if(number < 50) {
                continue; // 中斷本次迴圈, 立即執行下一個迴圈
            }
            System.out.println(number);
            if(number == 77) {
                break; // 離開迴圈
            }
        }

    }    
}
