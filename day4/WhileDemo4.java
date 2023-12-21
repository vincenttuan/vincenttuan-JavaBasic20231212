package day4;

public class WhileDemo4 {
    public static void main(String[] args) {
        int number = 333;
        // number 是否是質數 ?
        int i = 2;
        boolean isPrime = true; // 是否為質數(預設: true)
        while (i <= Math.sqrt(number)) {
            System.out.printf("%d %% %d = %d%n", number, i, number%i);
            if(number%i == 0) {
                isPrime = false;
                break;
            }
            i++; //i = i + 1;
        }
        System.out.printf("%d %s%n", number, (isPrime ? "是質數" : "不是質數"));
    }
}
