package day4;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(9) + 1; // 1~9 的隨機數
        Scanner scanner = null;
        
        do {
            scanner = new Scanner(System.in);
            // 玩家開始
            System.out.print("玩家請猜一個數字:");
            // 得到玩家所輸入的數字
            int userGuess = scanner.nextInt();
            // 判斷玩家所猜的數字
            if(userGuess > answer) {
                System.out.println("玩家猜大了");
            } else if(userGuess < answer) {
                System.out.println("玩家猜小了");
            } else {
                System.out.println("玩家猜對了, GG");
                break;
            }
            
        } while(true);

        scanner.close();
    }
}
