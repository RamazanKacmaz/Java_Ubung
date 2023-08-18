package C27_C35;

import java.util.Scanner;

public class C27 {
  /*  TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz.

     ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.

    Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
     9 katının toplamının birler basamağı 10. rakamı;

   1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen TC numaranizi giriniz..");
        String tcnumra = scanner.nextLine();

        if (gecerlikimlliknumarsi(tcnumra)){
            System.out.println("Geecerli kimlik no :");
        }else {
            System.out.println("Gecersiz...");
        }


    }

    public static boolean gecerlikimlliknumarsi (String kimlikno){
        // Kimlik numarasının uzunluğu 11 olmalıdır.
        if (kimlikno.length() != 11){
            return false;
        }
        // Kimlik numarasının son rakamı çift olmalıdır.
        int sonikirakam = Character.getNumericValue(kimlikno.charAt(10));
        if (sonikirakam % 2 != 0){
            return false;
        }
        // Kimlik numarası 0 ile başlayamaz.
        if (kimlikno.charAt(0) == '0'){
            return false;
        }
        // İlk 10 rakamın toplamının birler basamağı 11. rakamı vermelidir
        int toplam = 0;
        for (int i = 0; i <10 ; i++) {
            int rakam = Character.getNumericValue(kimlikno.charAt(i));
            toplam += rakam;
        }

        int birlerbasamgi = toplam % 10;
        if (birlerbasamgi != sonikirakam){
            return false;
        }

        // 1, 3, 5, 7 ve 9. rakamların toplamının 7 katı ile 2, 4, 6 ve 8. rakamların toplamının
        // 9 katının toplamının birler basamağı 10. rakamı vermelidir

        int tekrakamtoplami = 0;
        int ciftrakamtopami = 0;
        for (int i = 0; i <9 ; i++) {
            int rakam = Character.getNumericValue(kimlikno.charAt(i));

            if (i % 2 == 0){
                tekrakamtoplami += rakam;
            }else {
                ciftrakamtopami += rakam;
            }
        }

        int onuncurakam = Character.getNumericValue(kimlikno.charAt(9));
        int hesaplananonuncurakam = ((tekrakamtoplami*7) - (ciftrakamtopami*9));
        if (onuncurakam < 0){
            hesaplananonuncurakam += 10;

        }
        if (hesaplananonuncurakam != onuncurakam){
            return false;
        }
// 1, 3, 5, 7 ve 9. rakamların toplamının 8 katının birler basamağı 11. rakamı vermelidir.
        int tekrakmalrtoplami8kat = tekrakamtoplami*8;
        int birlerbasamgi11rakami = tekrakmalrtoplami8kat % 10;

        if (birlerbasamgi11rakami != sonikirakam){
            return  false;
        }
        // Tüm koşulları geçerse kimlik numarası geçerli kabul edilir.
        return true;
    }
}
