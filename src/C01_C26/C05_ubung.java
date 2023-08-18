package C01_C26;

import java.util.Scanner;

public class C05_ubung {
    public static void main(String[] args) {

        /*Soru 1 -)SOUT / SYSO Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
        *r = 7;
        *Pi = 3.14 * Dairenin Cevresi:
        2 * Pi * r * Dairenin Alani:
        Pi * r * r*/

        /* int yaricap = 7;
        System.out.println("Airenin cevrei = " + (2*3.14)*7);
        System.out.println("Dairenin Alani = "+ (3.14*7*7));*/


        /*Soru - 2)SOUT / SYSO
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
        *Dikdortgenin Cevresi:2 * (uzun kenar + kisa kenar)
        *Dikdortgenin Alani :uzun kenar *kisa kenar*/

        /*int uzunkenar = 15;
        int kisakenar = 10;

        System.out.println("Dikdotgenin cvresi = " + (2*(uzunkenar+kisakenar)));
        System.out.println("Dikdörtgenin Alani = " + (uzunkenar*kisakenar));*/

       /* Soru 3-)   SCANNER
        Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Lütfen 5 adet sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        int sayi4 = scanner.nextInt();
        int sayi5 = scanner.nextInt();

        int ortlm = ((sayi1+sayi2+sayi3+sayi4+sayi5)/2);

        System.out.println("Sonuc Toplam = "+ ortlm);*/

        /*Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.*/

        /*System.out.println("Lütfen bir sayi gitniz ...");
        int sayi = scanner.nextInt();
        int küp = (sayi*sayi*sayi);

        System.out.println("Sonuc = " + küp);*/

        /*Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.*/
        /*System.out.println("Lütfen karenin bir kenar uzunlugunu girniz...");
        int uzunluk = scanner.nextInt();
        System.out.println("Karenin alani = " + (uzunluk*uzunluk));*/

        /*Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç*/

        /*System.out.println("Günde kac bardak cay iciyorsunz");
        int bardakcay = scanner.nextInt();
        System.out.println("Bir bardaga kac seker atiyorsunuz ? ");
        int seker = scanner.nextInt();

        int yillikbardakcay = bardakcay*365;
        int yillikseker = (yillikbardakcay*seker);
        double sekerorani = yillikseker*1.5/1000;

        System.out.println("Yilllik : " + yillikbardakcay + " bardak cay iciyorsunuz ve " + " yillik : " + sekerorani + " kg seker kullaniyorsunuz.");*/


        /*Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        ( Data Casting -> Auto Widening ve Explicit Narrowing )*/

       /* System.out.println("Ondalikli bir sayi giriniz ...");
        double sayi = scanner.nextDouble();
        int tamsayi = (int) sayi;
        System.out.println("Yeni sayi :" + tamsayi);*/

        /*Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.*/

        System.out.println("Lütfen 3 basamakli bir sayi giriniz ...");
        int sayi = scanner.nextInt();
        int toplam = 0;

        int ilkbasamak = sayi % 10;
        sayi = sayi / 10;
        int onlar = sayi % 10;
        sayi = sayi / 10;
        int yuz = sayi;

        toplam = ilkbasamak + onlar + yuz;
        System.out.println(toplam);


    }
}
