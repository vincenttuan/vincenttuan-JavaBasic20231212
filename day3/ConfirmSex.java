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

        /** 
           判斷籍別使用 switch-case
           0 – 5 在臺灣出生之本籍國民
           6     入籍國民，原為外國人
           7     入籍國民，原為無戶籍國民
           8     入籍國民，原為香港居民或澳門居民
           9     入籍國民，原為大陸地區居民
        */
        
    }
}
