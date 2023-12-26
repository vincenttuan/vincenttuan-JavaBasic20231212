package day5;

public class Change3 {
    public static void main(String[] args) {
        int delta = 100;
        double price = 2.17; 
        int cash  = 10;
        int ret   = (int)((cash - price) * 100);
        System.out.printf("找錢: %.2f%n", ret/100.0);

        int coin5 = ret / (5*delta);
        ret = ret % (5*delta);

        int coin1 = ret / (1*delta);
        ret = ret % (1*delta);

        int cent25 = ret / 25;
        ret = ret % 25;

        int cent10 = ret / 10;
        ret = ret % 10;

        int cent5 = ret / 5;
        ret = ret % 5;

        int cent1 = ret;

        System.out.printf(" 5美元: %d 個%n", coin5);
        System.out.printf(" 1美元: %d 個%n", coin1);
        System.out.printf("25美分: %d 個%n", cent25);
        System.out.printf("10美分: %d 個%n", cent10);
        System.out.printf(" 5美分: %d 個%n", cent5);
        System.out.printf(" 1美分: %d 個%n", cent1);
        

    }
}
