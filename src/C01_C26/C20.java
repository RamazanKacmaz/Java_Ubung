package C01_C26;

import java.util.Scanner;

public class C20 {
    /*Soru 43-)
    C01_C26.Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın
    .
    Changename adında bir method oluşturun,
     parametre olarak öğrenci bilgileri alın ve methodda
     tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.

    C01_C26.Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.*/

    public static void main(String[] args) {

        String isim = "Hulya";
        String soyisim = "Erdemir";
        int yas = 19;
        String sinif = "12-B";

        Changename("Sera" , "Kara" , 40, "12-G");

        System.out.println("=========================");

        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);
        System.out.println(sinif);

        System.out.println("=========================");
        Changesurname("Erdem");


    }


    private static void Changesurname( String  lasstname) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen soyisminizi girin: ");
        String ogrenciSoyisim = scanner.next();
        System.out.println(ogrenciSoyisim);


    }

    private static void Changename( String isim , String  soyisim , int yas , String sinif) {
        isim = "Selma";
        soyisim  = " Kara";
        yas = 21;
        sinif  = "12 -C01_C26.C";

        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);
        System.out.println(sinif);

    }
}
