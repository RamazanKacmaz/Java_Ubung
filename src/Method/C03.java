package Method;

public class C03 {
    public int toplam (int sayi1 , int sayi2){
        int sonuc = sayi1+sayi2;
        return sonuc;
    }

    public int carpma(int sayi1 , int sayi2){
        int sonuc = sayi1*sayi2;
        return sonuc;
    }

    public static void main(String[] args) {
        C03 hesap = new C03();
        int x = 10;
        int y = 5;

        int toplam = hesap.toplam(x,y);
        System.out.println(x + " + " + y + "=  " + toplam);

        int carpma = hesap.carpma(x,y);
        System.out.println(x + " * " + y + " =  " + carpma);
    }
}
