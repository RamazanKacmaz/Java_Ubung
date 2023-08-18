package C01_C26;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {


        /*for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " x " +  j + " = " + (i*j) + "\t" );
            }
            System.out.println("");
        }*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Lutfen bir sayi giriniz...");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if (!(i % 2 == 0)){
                System.out.print(i + " ");
            }

        }*/

        System.out.println("Lütfen baslangic ve bitis degeri pozitif bir sayi yaziniz...");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        int toplam = 0;

        if (bitis < baslangic){
            System.out.println("yanlis girdibiz....");
        }else {
            for (int i = baslangic; i <= bitis ; i++) {

                toplam += i ;

            }
            System.out.println(toplam);
        }









    }
}
