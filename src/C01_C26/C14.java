package C01_C26;

import java.util.Locale;
import java.util.Scanner;

public class C14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz...");
        String  name = scanner.nextLine();
        System.out.println("Lütfen soyadinizi giriniz...");
        String surname = scanner.nextLine();
        System.out.println(isimsoyisim(name, surname));

    }

    private  static String isimsoyisim(String name , String  surname){
        name= name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+ surname.substring(1).toLowerCase();
       String duzenliisim = name+" "+surname;
        return duzenliisim;
    }

}
