import java.util.Locale;
import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
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


    }
}
