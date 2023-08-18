package C27_C35;

public class C31 {
    /*Soru 3 : Kullanicidan bir String ve aranacak metin alin. String’in aranan
    metni icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.*/
    public static void main(String[] args) {

        String str = "Merhaba, dünya!";
        String arananMetin = "dünya";

        int indeks = str.indexOf(arananMetin);

        if (indeks != -1) {
            System.out.println("Aranan metin bulundu. Başlangıç indeksi: " + indeks);
        } else {
            System.out.println("Aranan metin bulunamadı.");
        }
    }
}
