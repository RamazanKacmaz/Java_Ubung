package C01_C26;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String ad = scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println("Lutfen cinisyetinizi giriniz");
        char cinsiyet = scanner.next().charAt(0);

        Student ogrenci1 = new Student(ad,soyad,yas,cinsiyet);

        Student ogrenci2 = new Student(ad,soyad,yas,cinsiyet);

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);

    }
}
