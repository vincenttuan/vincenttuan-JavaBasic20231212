package day2;
/**
 * 風險等級:1~5
 * 小明的投資組合如下
 * 股票
 *      投資額: 100,000
 *      年收益率: 8%
 *      風險等級: 4
 * 債券
 *      投資額: 50,000
 *      年收益率: 3%
 *      風險等級: 2
 * 房地產
 *      投資額: 150,000
 *      年收益率: 6%
 *      風險等級: 3 
 * 
 * 請問:
 * 1. 每一項的投資預期年收益為何?
 * 2. 總投資額和年收益總額各是多少?
 * 3. 若小明希望降低整體投資組合的風險等級, 他應該增加哪一類的投資?
 */

public class Demo3 {
    public static void main(String[] args) {
        // 股票
        double stockAmount = 100_000;
        double stockReturnRate = 0.08;
        int stockRisk = 4;
        // 債券
        double bondAmount = 50_000;
        double bondReturnRate = 0.03;
        double bondRisk = 2;
        // 房地產
        double realEstateAmount = 150_000;
        double realEstateReturnRate = 0.06;
        double realEStateRisk = 3;

        // 1. 每一項的投資預期年收益為何?
        double stockReturn = stockAmount * stockReturnRate;
        double bondReturn = bondAmount * bondReturnRate;
        double realEstateReturn = realEstateAmount * realEstateReturnRate;

        // 2. 總投資額和年收益總額各是多少?
        double totalInvestment = stockAmount + bondAmount + realEstateAmount;
        double totalReturn = stockReturn + bondReturn + realEstateReturn;

        System.out.printf("股票預期年收益 : %,.0f%n", stockReturn);
        System.out.printf("債券預期年收益 : %,.0f%n", bondReturn);
        System.out.printf("房地產預期年收益 : %,.0f%n", realEstateReturn);
        System.out.printf("總投資額 : %,.0f%n", totalInvestment);
        System.out.printf("年收益總額 : %,.0f%n", totalReturn);

        // 3. 若小明希望降低整體投資組合的風險等級, 他應該增加哪一類的投資?
        // 找風險最低的投資商品(stockRisk, bondRisk, realEStateRisk)
        

    }
}
