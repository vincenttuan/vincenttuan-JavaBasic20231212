package day2;

public class Demo2 {
    public static void main(String[] args) {
        String stockName = "鴻海"; // 股票名稱
        String stockNo = "2317.TW"; // 股票代號
        double cost = 99.5; // 買進成本(每股)
        int shares = 2; // 買進張數(1張 = 1000)
        double closePrice = 102; // 今日收盤價
        // 試問此股票賺賠多少錢 ?
        // 計算總投資額與股票現值
        double totalInvestment = cost * shares * 1000; // 總投資額
        double currentValue = closePrice * shares * 1000; // 股票現值
        // 計算總利潤或虧損
        double profit = currentValue - totalInvestment; // 股票現值 - 總投資額

        System.out.printf("總投資額: %,.0f%n", totalInvestment);
        System.out.printf("股票現值: %,.0f%n", currentValue);
        System.out.printf("總利潤: %,.0f%n", profit);

        // 請問報酬率ROI ?
        // roi = profit / totalInvestment
        double roi = profit / totalInvestment;
        System.out.printf("報酬率ROI: %.3f %n", roi);
        System.out.printf("報酬率ROI: %.3f%% %n", roi*100);
    }
}
