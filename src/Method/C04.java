package Method;

public class C04 {

    public void selamVer(){
        System.out.println("Merhaba nasilsin");
    }

    public void faktoriyelhesapla(int n){
        int faktoriyel = 1;

        for (int i = 1; i <= n ; i++) {
            faktoriyel *= i;
        }
        System.out.println((n + " sayisinin faktoriyeli : " + faktoriyel));
    }

    public static void main(String[] args) {
        C04 example = new C04();
        example.selamVer();
        int sayi = 5;

        example.faktoriyelhesapla(sayi);
    }
}
