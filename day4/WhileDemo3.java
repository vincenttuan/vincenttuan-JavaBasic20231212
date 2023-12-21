package day4;

import java.util.Random;

public class WhileDemo3 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // 0~99 的隨機數
            // number 只要是 3 的倍數就要印出, 若 number 是 99 則離開迴圈
            if(number % 3 != 0) {
                continue;
            }
            System.out.println(number);
            if(number == 99) {
                break;
            }
        }
    }
}
