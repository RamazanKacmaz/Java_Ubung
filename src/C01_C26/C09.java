package C01_C26;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mailinizi giriniz");
        String mail = scanner.nextLine();
        
        if (!(mail.contains("@"))){
            System.out.println("gecersiz mail");
        } else if (!(mail.contains("@gmail.com"))) {
            System.out.println("mail gmail olmali");
        } else if (!(mail.endsWith("@gmail.com"))) {
            System.out.println("yazim hatai vardir");
        }else {
            System.out.println("girsib basarili");
        }


    }
}
