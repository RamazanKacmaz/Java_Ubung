package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class C04 {
    private String name;
    private int quantity;

    public C04(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    private int getQuantity(){
        return quantity;
    }

    public void addQuantity(int amount){
        quantity += amount;
    }
    
    public void reduceQuantity (int amount){
        if (amount <= quantity){
            quantity -= amount;
        }else {
            System.out.println("Stokta yeterli malzeme yok");
        }
    }

    @Override
    public String toString() {
        return name + " -Stok: " + quantity;
    }

    public static void main(String[] args) {
        ArrayList<C04> inventory = new ArrayList<>();
        
        inventory.add(new C04("Kalem", 50));
        inventory.add(new C04("Defter", 30));
        inventory.add(new C04("Dosya", 25));

        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Envanter durumu :");
            for (C04 each:inventory
                 ) {
                System.out.println(each);
            }

            System.out.println("\n1. Malzeme ekle");
            System.out.println("\n2. Malzeme cikar");
            System.out.println("\n3. Cikis");
            System.out.println("Seciminizi yapin: ");
            
            int secim = scanner.nextInt();
            
            if (secim== 1){
                System.out.println("Malzeme adi :");
                scanner.nextLine();
                String itemName = scanner.nextLine();
                System.out.println("Miktar :");
                int miktar = scanner.nextInt();
                inventory.add(new C04(itemName,miktar) );
            } else if (secim == 2) {
                System.out.print("Malzeme adı: ");
                scanner.nextLine();
                String itemName = scanner.nextLine();
                System.out.print("Çıkarılacak miktar: ");
                int quantity = scanner.nextInt();
                for (C04 each:inventory
                     ) {
                    if (each.getName().equalsIgnoreCase(itemName)){
                        each.reduceQuantity(quantity);
                        break;
                    }
                }
            } else if (secim == 3) {
                System.out.println("Cikiliyor..");
                break;
            }else {
                System.out.println("Gecersiz secim");
            }
            scanner.close();
        }
    }
}
