package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Registration {

    static ArrayList<User> kullanicilar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<User> register(){
        System.out.println("lütfen Adinizi giriniz...");
        String name = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        User kullanici = new User(name,time);
        kullanicilar.add(kullanici);
        return kullanicilar;

    }

    static void printHappyUser(ArrayList<User> list){

        for (User each:list
             ) {
            if (each.registrationDate.getSecond()<=10){
                System.out.println(each.name + " Kazandiniz...");
            }else {
                System.out.println(each.name + " Kaybettiniz...");
            }
        }

    }

    void kullanicilistesi (ArrayList<User> list){
        for (User each:list
             ) {
            System.out.println("Isim :  " + each.name + " Kayit zamani " + each.registrationDate);
        }
    }
}
