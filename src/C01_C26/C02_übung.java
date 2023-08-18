package C01_C26;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class C02_übung {
    public static void main(String[] args) {

        /*int sayi1 = 12;
        byte sayi2 = (byte) sayi1;
        System.out.println(sayi2);*/

        /*char harf = 'a';
        int toplam = 100 + harf;
        System.out.println(toplam);*/

        /*int sayi = 10;
        Integer sayiW = 20;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(34,456));
         */
        /*int sayi1 = 5;
        int sayi2  = 8;
        int sayi3  = 15;
        double toplam = sayi1+sayi2+sayi3;
        System.out.println("Double Toplam :" + toplam);*/

        Scanner scanner = new Scanner(in);
        /*System.out.println("Lutfen bir harf yaziniz : ");
        char girilenHarf = scanner.next().charAt(0);

        System.out.println("girilen harf :" +
                (char)(girilenHarf+1)+" "+ (char)(girilenHarf+2)
                );*/
        /*System.out.println("bir sayi girin");
        int alinanSayi = scanner.nextInt();
        byte sayi3 = (byte) alinanSayi;
        System.out.println(sayi3);*/

       /* System.out.println("Lutfen iki dbl sayi giriniz : ");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        int bolum = (int) (sayi1/sayi2);
        System.out.println(bolum);*/

        /*System.out.println("Lutfen bir ondalik sayi giriniz " );
        double dbl = scanner.nextDouble();
        System.out.println("Lutfen bir tam sayi giriniz ");
        int sayi = scanner.nextInt();

        double bolum = dbl/sayi;
        int sonuc = (int) bolum;
        System.out.println(sonuc);*/

        /*System.out.println("Lutfen 3 basmakli pozitif bir tamsayi giriniz:");
        int girilenSayi = scanner.nextInt();
        int sonrakam = girilenSayi % 10;
        int kalansayi = girilenSayi/10;
        int toplam = kalansayi % 10;
        int toplam2 = kalansayi/10;
        System.out.println("rakamlar toplami : " + (sonrakam+toplam+toplam2));*/

        /*int sayi = 10;
        System.out.println(sayi++);
        System.out.println(sayi);*/

        /*int a = 10 ;
        System.out.println(++a);
        int b = a++;
        System.out.println(b);
        int c = b++ + a ;
        System.out.println(c);
        System.out.println(a+b+c);*/

        /*String s1 = "Java";
        String s2 = " ";
        String s3 = "kolay";
        String s4 = "";
        int a = 3;
        int b = 4;
        System.out.println((a*b)+ s2 + s1 + s2 + s3);*/

       /* System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        if ( sayi % 5 == 0){
            System.out.println("sayi 5´in tam kati");
        }*/

       /* System.out.println("lutfen bir harf giriniz.");
        char harf = scanner.next().charAt(0);

        harf = Character.toLowerCase(harf);

        if (harf == 'o'){
            System.out.println("Ocak");
        } else if (harf == 's') {
            System.out.println("subat");
        }else{
            System.out.println("olmadi dost");
        }*/

        /*System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0){
            System.out.println("sayi 3 bolunuyor");
        } else if (sayi % 5 == 0) {
            System.out.println("sayi 5 bolnur");
        }else {
            System.out.println("bos sayi");
        }*/

        /*System.out.println(" ucgen birince");
        int kenar1 = scanner.nextInt();
        System.out.println("Ucgen ikinci");
        int kenar2 = scanner.nextInt();
        System.out.println("ucgen ucuncu");
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3){
            System.out.println("bu eskanar ucgendir ");
        }else {
            System.out.println("eskanr degil");
        }*/

        /*System.out.println("Lutfen notunuzu giriniz : ");
        double note = scanner.nextDouble();
        if (note > 50){
            System.out.println("sinifi gectin hurraaa....");
        }else {
            System.out.println("Kaldin hadi yuru git");
        }*/

        /*System.out.println("Lutfen bir krakter giriniz");
        char harf = scanner.next().charAt(0);

        if (Character.isLowerCase(harf)){
            harf  = Character.toUpperCase(harf);
            System.out.println(harf);
        }else {
            System.out.println("kucuk harf" + harf);
        }*/

        /*System.out.println("Lutfen cinsiyetinizi giriniz kadin K , erkek E :");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

      if (cinsiyet == 'E' && yas >= 65){
          System.out.println("Erkek Sahis Emekli olabilir");
      } else if (cinsiyet == 'E' && yas < 65) {
          System.out.println("ERkek sahis "+ (65 -yas) + " yil daha calismalidir.");
      } else if (cinsiyet == 'K' && yas >=60) {
          System.out.println("Kadin sahis emekli olabilir.");
      } else if (cinsiyet == 'K' && yas < 60 ) {
          System.out.println("Kadin sahis " + ( 60-yas) + " yil daha calismalidir.");
      }else {
          System.out.println("Yanlis krakter girdiniz.");
      }*/
        /*System.out.println("Lutfen kilonuzu giriniz.");
        int kilo = scanner.nextInt();

        System.out.println("Lutfen boyunuzu giriniz.");
        int boy = scanner.nextInt();

        int vucutkitle = (kilo*10000/(boy*boy));

        if (vucutkitle > 30){
            System.out.println("obez");
        } else if (vucutkitle > 25) {
            System.out.println("kilolu");
        } else if (vucutkitle > 20) {
            System.out.println("zayif");
        }*/

        /*System.out.println("Lutfen aldiginiz urun adedini girin");
        int urunadedi = scanner.nextInt();

        System.out.println("Lutfen liste fiatini giriniz");
        int listefiati = scanner.nextInt();

        System.out.println("Musteri kariniz var mi ? evet E , hayir H ");
         char musterikarti = scanner.next().toUpperCase().charAt(0);
         
         if ( musterikarti == 'E' && urunadedi > 10){
             System.out.println("% 20 indirim aldiniz." + (urunadedi*listefiati)/20 + " $ indirim aldiniz");
         } else if (musterikarti == 'H' && urunadedi > 10) {
             System.out.println("% 15 indirim kazandiniz."+ (urunadedi*listefiati));
         } else if (musterikarti == 'E' && urunadedi < 10 ) {
             System.out.println("%15 indirim kazandiniz"+ (urunadedi*listefiati));
         } else if (musterikarti == 'H' && urunadedi < 10) {
             System.out.println("% 10 indirim aldiniz" +(urunadedi*listefiati));
         }*/

       /* System.out.println("Lutfen kac KM uzakliktasiniz yaziniz.");
      double mesafe = scanner.nextDouble();

        System.out.println("Lutfen birimi giriniz");
        String birim = scanner.next();

        if (birim.equals("metre")){
            double mesafemetre = mesafe*1000;
            System.out.println("sonuc " + mesafemetre + " metre") ;
        } else if (birim.equals("santimetre")) {
            double mesadesantometre = mesafe*100000;
            System.out.println("sonuc" + mesadesantometre + "  Santimetre");
        }else {
            System.out.println("Girdihniz olcu bizim siteme kayizli degil");
        }*/

        /*System.out.println("Lutfen tutugun takimin bas harflerini gir");
        String takim = scanner.nextLine().toUpperCase(Locale.ROOT);

        if (takim.equals("GS")){
            int yildiz = 55/23 ;
            System.out.println("Her sene sampiyon * " + yildiz + " sahibi");
        } else if (takim.equals("FB")) {
            int yildiz = 55/19 ;
            System.out.println("Hayatin hüsran * " + yildiz + " sahibi");
        } else if (takim.equals("BJK")) {
            System.out.println("Kiz takimi");
        } else if (takim.equals("TS")) {
            System.out.println("Laz takimi");
        }else {
            System.out.println("Anadolu takimi");
        }*/

        /*System.out.println(" Lutfen bir yil giriniz : ");
        int sene = scanner.nextInt();

        if ( !(sene % 4 == 0 )){
            System.out.println("artik yil degil");
        } else if (sene % 4 == 0  && !(sene % 100 == 0)) {
            System.out.println("artik yildir");
        } else if (sene % 4 == 0 && sene % 100 == 0 && sene % 400 == 0 ) {
            System.out.println("artik yildir");
        }*/

        /*System.out.println("Lutfen Cinsiyeti giriniz erkek , kadin :");
        String cinsiyet = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        if (cinsiyet.equals("Erkek") && yas >= 65 ){
                System.out.println("emekli olabilir");
            }else if (cinsiyet.equals("Erkek") && yas < 65){
                System.out.println("Emekli olmak icin " + (65 - yas) +" yil daha calismalisiniz.");
            } else if (cinsiyet.equals("Kadin") && yas > 60) {
                System.out.println("Emekli olabilir");
            }else if (cinsiyet.equals("Kadin") && yas < 60){
                System.out.println("emekli olmak icin" + (60-yas) +" yil daha calismalisiniz.");
            }*/

       /* System.out.println("Lutfen bir sayi girniz  : ");
        int sayi = scanner.nextInt();

        System.out.println(sayi % 5 == 0 ? "sayi 5 bolunur" : "sayi 5 bolumez");*/

        /*System.out.println("Lutfen 3 kenar uzunlugu yaziniz : ");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 ? "eskenar ucgen" : " eskenar ucgen degil.");*/

        /*System.out.println("Lutfen bir harf giriniz");
       char harf = scanner.next().charAt(0);

        System.out.println((Character.isUpperCase(harf)) ? Character.isLowerCase(harf) : harf);*/

        /*System.out.println( "Lutfen notunuzu girin.");

        int note = scanner.nextInt();

        System.out.println(note > 50 ? " Gectiniz" : "Kaldiniz");*/

        /*System.out.println("Lutfen iki sayi girin");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(sayi1 > sayi2 ? sayi1 : sayi2);*/

        /*System.out.println("sayi girin");
        int sayi = scanner.nextInt();
        System.out.println(sayi > 0 ? sayi*1 : sayi*(-1));*/

        /*System.out.println("Lutfen bir rakam yaziniz");
        int rakam = scanner.nextInt();

        switch (rakam){
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            case 3 :
                System.out.println("uc");

                break;
            default:{
                System.out.println("gecrsiz sayi");
            }
        }*/

        /*System.out.println("Lutfen bir ay numrasi giriniz : ");
        int monat = scanner.nextInt();

        switch (monat){
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayis");
                break;
            case 6 :
                System.out.println("haziran");
                break;
            case 7 :
                System.out.println("temmuz");
                break;
            case 8 :
                System.out.println("agustos");
                break;
            case 9 :
                System.out.println("eylül");
                break;
            case 10 :
                System.out.println("ekim");
                break;
            case 11 :
                System.out.println("kasim");
                break;
            case 12 :
                System.out.println("aralik");
                break;
            default:{
                System.out.println("Gecersiz bir ay girfiniz");
            }

        }*/


        //String isim = "ramazan";
        //String soyad = "KACMAZ";

        //System.out.println(isim.equals("ramazan"));
        //System.out.println(soyad.equalsIgnoreCase("kacmaz"));
        //System.out.println(isim.length()-2);
        //System.out.println(isim.charAt(isim.length()-2));
        //System.out.println(isim.substring(3));
        // System.out.println(isim.contains("an"));
        //System.out.println(isim.startsWith("r"));

        //isim = isim.toUpperCase();
        //System.out.println(isim);

        //System.out.println(isim.toUpperCase(Locale.ROOT));
        //System.out.println(isim.toLowerCase());
        //System.out.println(soyad.toLowerCase());

        //System.out.println("Lutfen mail giriniz :");
        //String mail = scanner.nextLine();

       /* if (!(mail.contains("@"))){
            System.out.println("gecersiz mail");
        } else if (!(mail.contains("@gmail.com"))) {
            System.out.println("mail gmail olmali");
        } else if (!(mail.endsWith("@gmail.com"))) {
            System.out.println("mailde yazim hatasi var");
        }*/

       /* String ad = "Ramazan";
        System.out.println(ad.indexOf('m'));
        System.out.println(ad.indexOf('h'));*/

        /*System.out.println("Lutfen bir metin yazin");
        String metin = scanner.nextLine();
        System.out.println(metin.indexOf("bos"));*/

        /*for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
        }*/

       /* System.out.println("Lutfen bir sifre giriniz : ");

        String sifre = scanner.nextLine();

        boolean flag = true;

        char ilkharf = sifre.charAt(0);

        if (!(ilkharf >= 'a' && ilkharf <= 'z')){
            System.out.println("Ilk krakter kucuk harf olmali");
            flag = false;
        }

        char sonkrakter = sifre.charAt(sifre.length()-1);

        if (!(sonkrakter >= '0' && sonkrakter <= '9')){
            System.out.println("son krakter rakam olmai");
            flag=false;
        }

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag=false;
        }

        if (!(sifre.length()>=10)){
            System.out.println("sifre en az on krakter olmali");
            flag = false;
        }

        if (flag){
            System.out.println("sifre basarili..");
        }*/



        /*if (ev){
            out.println("home home sweet home");
        } else if (is) {
            out.println("calismak guzeldir");
        } else if (ev && is) out.println("Hem ev lazim hem is");
        else {
            out.println("cok calisman lazim");
        }*/

        /*if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else{
            System.out.println("cok calisman lazim");
        }*/

        for (int i = 0; i <= 25 ; i++) {
            out.print(i + " ");
        }


        

    }
}
