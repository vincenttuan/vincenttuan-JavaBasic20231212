package day4;

public class WhileDemo5 {
    public static void main(String[] args) {
        // 請印出 0~100 所有質數
        int n = 0;
        while (n <= 100) {
            boolean isPrime = checkPrime(n);
            if(isPrime) {
                System.out.println(n);
            }
            n++;
        }
    }

    // 判斷 number 是否是質數的方法
    // 若是質數則回傳 true, 反之回傳 false
    private static boolean checkPrime(int number) {
        if(number < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if(number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
