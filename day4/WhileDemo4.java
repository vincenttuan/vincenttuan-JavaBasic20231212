package day4;

public class WhileDemo4 {
    public static void main(String[] args) {
        int number = 9;
        // number 是否是質數 ?
        int i = 2;
        while (i <= number/2) {
            System.out.println(i);
            i++; //i = i + 1;
        }
    }
}
