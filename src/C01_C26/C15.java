package C01_C26;

import java.util.Random;
import java.util.Scanner;

public class C15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aklinda bir sayi tut Tahmin et");
       Random random = new Random();
       int sayi = random.nextInt(150);
       boolean dogrumMu = false;

       while (!dogrumMu) {
           int tahmin = scanner.nextInt();
           if (tahmin > sayi) {
               System.out.println("cok soyledm dusur");
           } else if (tahmin < sayi) {
               System.out.println("az soyledein arttir");

           } else if (tahmin==sayi) {
               System.out.println("Tebrikler bildin");
               dogrumMu=true;
           }else {
               dogrumMu=false;
           }
       }


    }
}
