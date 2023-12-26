package day5;

import java.util.Scanner;

// 快速電梯
// Math.abs(cur - tar) <= 10 delay 1000
// Math.abs(cur - tar) <= 50 delay 300
// Math.abs(cur - tar) <= 101 delay 100

public class Elevator2 {
    public static void main(String[] args) throws Exception {
        int min = -3;
        int max = 101;
        int delay = 1000;
        int cur = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("101大樓電梯目前在 %d 樓, 請問你要到哪一層:", cur);
            int tar = scanner.nextInt();
            if(tar == 0) {
                break;
            }
            // 檢查 tar 是否在合理的範圍
            if(tar < min || tar > max || tar == cur) {
                continue;
            }
            // 設定 delay
            delay = Math.abs(cur - tar) <= 10 ? 1000 : Math.abs(cur - tar) <= 50 ? 300 : 100;

            if(tar > cur) {
                System.out.println("電梯上樓");
                for(;cur < tar;cur++) {
                    System.out.printf("%d樓%n", cur);
                    Thread.sleep(delay); // 暫停
                }
            } else {
                System.out.println("電梯下樓");
                for(;cur > tar;cur--) {
                    System.out.printf("%d樓%n", cur);
                    Thread.sleep(delay); // 暫停
                }
            }
            System.out.printf("到達目 %d 樓%n", cur);
            

        } while(true);

        scanner.close();
    }
}
