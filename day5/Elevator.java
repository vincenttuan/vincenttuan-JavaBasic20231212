package day5;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) throws Exception {
        int min = 1;
        int max = 7;
        int cur = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("電梯目前在 %d 樓, 請問你要到哪一層:", cur);
            int tar = scanner.nextInt();
            // 檢查 tar 是否在合理的範圍
            if(tar < min || tar > max || tar == cur) {
                continue;
            }

            if(tar > cur) {
                System.out.println("電梯上樓");
                for(;cur < tar;cur++) {
                    System.out.printf("%d樓%n", cur);
                    Thread.sleep(1000); // 暫停 1000ms = 1s
                }
            } else {
                System.out.println("電梯下樓");
                for(;cur > tar;cur--) {
                    System.out.printf("%d樓%n", cur);
                    Thread.sleep(1000); // 暫停 1000ms = 1s
                }
            }
            System.out.printf("到達目 %d 樓%n", cur);
            

        } while(true);
    }
}
