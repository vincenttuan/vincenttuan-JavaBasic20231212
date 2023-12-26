package day5;

import java.util.Scanner;

/*
 * 一家商店對其商品進行折扣銷售。折扣規則如下：
 * 如果購買數量小於 10 件，則無折扣。
 * 如果購買數量在 10 到 20 件之間（包括 10 件和 20 件），則給予 10% 的折扣。
 * 如果購買數量超過 20 件，則給予 15% 的折扣。
 * 
 * 假設:
 * 商品單價: $50
 * 購買數量分別為: 25件, 8件, 13件
 * 分別輸出:
 * 折扣後的總售價
 */
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitPrice = 50; // 單價
        System.out.printf("請輸入購買數量:", unitPrice);
        int quantity = scanner.nextInt();
        double discount; // 商品折扣
        if(quantity < 10) {
            discount = 0;
        } else if(quantity <= 20) {
            discount = 0.10; // 10% 折扣
        } else {
            discount = 0.15; // 15% 折扣
        }
        double totalCost = unitPrice * quantity * (1 - discount);
        System.out.println("-----------------------------");
        System.out.printf("商品單價: $%d%n", unitPrice);
        System.out.printf("購買數量: %d 件%n", quantity);
        System.out.printf("折扣: %.0f%%%n", discount*100);
        System.out.printf("應付金額: $%,.0f%n", totalCost);
    }
}
