package day5;

// 找紙鈔與零錢程式
public class Change2 {
    public static void main(String[] args) {
        int price = 123;
        int cash = 1000;
        int ret = cash - price;
        System.out.printf("可樂 $%d%n", price);
        System.out.printf("付款 $%d%n", cash);
        System.out.printf("應找 $%d%n", ret);
        // 找紙鈔 500, 200, 100 各要找幾張 ?
        int coin500 = ret / 500;
        ret = ret % 500;
        //---------------------------------------------
        int coin200 = ret / 200;
        ret = ret % 200;
        //---------------------------------------------
        int coin100 = ret / 100;
        ret = ret % 100;
        //---------------------------------------------
        // 找零錢 50, 10, 5, 1 各要找幾個 ?
        // 找幾個 50 元硬幣
        int coin50 = ret / 50;
        ret = ret % 50;       
        //---------------------------------------------
        int coin10 = ret / 10;
        ret = ret % 10;       
        //---------------------------------------------
        int coin5  = ret / 5; 
        ret = ret % 5;        
        //---------------------------------------------
        int coin1  = ret;

        System.out.printf("500元: %d 張%n", coin500);
        System.out.printf("200元: %d 張%n", coin200);
        System.out.printf("100元: %d 張%n", coin100);
        System.out.printf(" 50元: %d 個%n", coin50);
        System.out.printf(" 10元: %d 個%n", coin10);
        System.out.printf("  5元: %d 個%n", coin5);
        System.out.printf("  1元: %d 個%n", coin1);

    }
}
