package day4;

import java.util.Random;

public class WhileDemo1 {
    public static void main(String[] args) {
        Random random = new Random(); // 隨機物件
        while (true) { // 停止程式 Ctrl + C
            System.out.println(random.nextInt()); // 隨機整數
            System.out.println(random.nextInt(100)); // 隨機整數 0~99 之間
            System.out.println(random.nextInt(2)); // 隨機整數 0~1 之間    
        }
    }
}
