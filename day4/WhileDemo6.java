package day4;

public class WhileDemo6 {
    public static void main(String[] args) {
        // N * N 乘法表
        // 若使用者輸入 9 就是 9 * 9 乘法表
        // 若使用者輸入 13 就是 13 * 13 乘法表

        int n = 9;

        int x = 1;
        while (x <= n) {

            int y = 1;
            while (y <= n) {
                System.out.printf("%2d*%2d=%2d ", x, y, (x * y));
                y++;
            }
            System.out.println();

            x++;
        }

    }
}
