package C01_C26;

import java.util.Scanner;

public class c04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen bir sayi giriniz giriniz : ");


       /* int bas = 201;
        int  bit = 237;
        int aranansayi = 43;
        for (int i = bas; i <= bit ; i++) {
            System.out.println(i);
            if (i % aranansayi == 0){
                System.out.println("bulundu artik");
                break;
            }
        }*/

       /* System.out.println("Lutfen bir baslangic degeri girniz");
        int bas = scanner.nextInt();

        System.out.println("Lutfen bitis degeri girniz");
        int bit = scanner.nextInt();
        int toplam = 0;

        if (bas < bit){

            for (int i = bas; i <= bit ; i++) {

                toplam += i;

            }

        }else {
            for (int i = bit; i <= bas ; i++) {
                toplam += i ;
            }
        }

        System.out.println(toplam);*/


        /*System.out.println("Lutfen bir 20 den kucuk bir sayi girinizbaslangic degeri girniz");
        int sayi = scanner.nextInt();

        int faktariyel = 1;

        for (int i = 1; i <= sayi ; i++) {

            faktariyel *= i ;
        }

        System.out.println(faktariyel);*/

        /*System.out.println("Lutfen bir  degeri girniz");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 0; i <= sayi  ; i++) {

            toplam += i ;
        }
        System.out.println("girdiginiz deger "+ sayi + " sayilar toplami " + toplam);*/

        //System.out.println("Lutfen bir pozitif bir sayi   degeri girniz");
        /*int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if ( i % 3 == 0 && i % 5 == 0){
                System.out.print("fizzbuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("buzz ");
            } else if (i % 5 == 0 ) {
                System.out.print("fizz ");
            }else {
                System.out.print(i + " ");
            }
        }*/

       /* System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        System.out.println(metin.length() - 1);

        for (int i = metin.length()-1; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));
        }
        //System.out.println(" ");*/

        /*System.out.println("bir sayi gir");
        int sayi = scanner.nextInt();

        boolean flag = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                System.out.println("Asal degil");
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("asalllllllllll");
        }*/

       /* for (int i = 1; i <= 4 ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }*/


    }
}

