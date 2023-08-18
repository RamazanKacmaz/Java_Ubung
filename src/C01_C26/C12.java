package C01_C26;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cumle yaziniz...");
        String cumle = scanner.nextLine();

        if (cumle.contentEquals("ev") && cumle.contentEquals("is")){
            System.out.println("Hem ev hem is lazim");
        } else if (cumle.contentEquals("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contentEquals("is")) {
            System.out.println("Caslismak lazim");
        }else {
            System.out.println("Cok calisman lazim...(:");
        }


    }
}
