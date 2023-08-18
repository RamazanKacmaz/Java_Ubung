package C27_C35;

import java.util.Scanner;

public class C30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir String girin: ");
        String str = scanner.nextLine();

        System.out.print("Aranacak metni girin: ");
        String arananMetin = scanner.nextLine();

        int metinSayisi = metinIcerenAdet(str, arananMetin);

        if (metinSayisi == 0) {
            System.out.println("String, aranan metni içermiyor.");
        } else if (metinSayisi == 1) {
            System.out.println("Aranan metin, String içinde sadece 1 kez kullanılmış.");
        } else {
            System.out.println("Aranan metin, String içinde 1'den fazla kez kullanılmış.");
        }
    }

    public static int metinIcerenAdet(String str, String arananMetin) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(arananMetin, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

}
