package C27_C35;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class C29 {
    public static void main(String[] args) {
       /* Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in
        aranan metni icerip icermedigini indexOf( ) method’u kullanarak yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin girniz..");
        String metin = scanner.nextLine();
        System.out.println("========================");
        System.out.println("Lütfen bir string ifade giriniz..");
        String ifade = scanner.nextLine();
        System.out.println("==========================");

        int aranan = metin.indexOf(ifade);

     if (metin.contains(ifade)){
         System.out.println("kullanilmis");
     }else {
         System.out.println("kullanilmamsi");
     }


    }
}
