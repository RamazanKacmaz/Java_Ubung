package C01_C26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while (toplam <= 500){
            System.out.println("lutfen toplanmak uzere bir sayi girnizi");
            sayi= scanner.nextInt();
            toplam += sayi;
        }
        System.out.println(toplam);*/

        /*int [] sayi = new int[5];
        sayi[2] = 5;

        System.out.println(sayi[1]);

        System.out.println(Arrays.toString(sayi));*/

        /*String str = "amldd öldfdffj ödkf";

        String [] abc = str.split("");
        System.out.println(Arrays.toString(abc));*/

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(25);

        System.out.println(sayilar);

        System.out.println(sayilar.size());

    }
}
