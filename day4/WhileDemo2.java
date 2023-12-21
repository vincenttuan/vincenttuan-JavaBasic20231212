package day4;

import java.util.Random;

public class WhileDemo2 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100); // 0~99 的隨機數
            System.out.println(number);
            if(number == 77) {
                break; // 離開迴圈
            }
        }

    }    
}
