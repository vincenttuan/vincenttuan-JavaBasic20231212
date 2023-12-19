package day3;

public class ConfirmSex {
    public static void main(String[] args) {
        String id = "A123456789";
        char area = id.charAt(0); // 戶籍地
        char sex  = id.charAt(1);  // 性別
        char type = id.charAt(2); // 籍別
        
        // 判斷性別使用 if-else
        if(sex == '1') {
            System.out.println("男性");
        } else if(sex == '2') {
            System.out.println("女性");
        } else {
            System.out.println("性別錯誤");
        }

        // 判斷性別使用 switch-case
        switch (sex) {
            case '1':
                System.out.println("男性");
                break;
            case '2':
                System.out.println("女性");
                break;
            default:
                System.out.println("性別錯誤");
                break;
        }

        

    }
}
