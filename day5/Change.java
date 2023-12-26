package day5;

// 找零錢程式
public class Change {
    public static void main(String[] args) {
        int price = 23;
        int cash = 100;
        int ret = cash - price;
        System.out.printf("可樂 $%d%n", price);
        System.out.printf("付款 $%d%n", cash);
        System.out.printf("應找 $%d%n", ret); // 77
        // 找零錢 50, 10, 5, 1 各要找幾個 ?
        // 找幾個 50 元硬幣
        int coin50 = ret / 50; // coin50 = 77 / 50 = 1
        ret = ret % 50;        // ret    = 77 % 50 = 27
        //---------------------------------------------
        int coin10 = ret / 10; // coin10 = 27 / 10 = 2
        ret = ret % 10;        // ret    = 27 % 10 = 7
        //---------------------------------------------
        int coin5  = ret / 5;  // coin5  = 7 / 5   = 1
        ret = ret % 5;         // ret    = 7 % 5   = 2
        //---------------------------------------------
        int coin1  = ret;

        System.out.printf("50元: %d 個%n", coin50);
        System.out.printf("10元: %d 個%n", coin10);
        System.out.printf(" 5元: %d 個%n", coin5);
        System.out.printf(" 1元: %d 個%n", coin1);

    }
}
