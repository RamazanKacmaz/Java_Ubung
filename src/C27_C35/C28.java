package C27_C35;

public class C28 {
    /*Soru 6 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €” output : 26.70 €*/

    public static void main(String[] args) {

        String inpu1 ="15.30";
        String input2 = "11.40";

        double sayi1 = Double.parseDouble(inpu1 );
        double sayi2 = Double.parseDouble(input2);
        System.out.println(Math.round (Math.round (sayi1 +sayi2)  ));

    }
}
