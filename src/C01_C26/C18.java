package C01_C26;

public class C18 {
    String  hastaAdi ;
    String hastaSoyadi;

    int hastayas;

    public C18() {
    }

    public C18 (String hastaAdi ,String hastaSoyadi, int hastayas){

        this.hastaAdi = hastaAdi;
        this.hastaSoyadi = hastaSoyadi;
        this.hastayas = hastayas;

     }

    @Override
    public String toString() {
        return "C01_C26.C18{" +
                "hastaAdi='" + hastaAdi + '\'' +
                ", hastaSoyadi='" + hastaSoyadi + '\'' +
                ", hastayas=" + hastayas +
                '}';
    }

    public static void main(String[] args) {

        C18 hasta = new C18("Ramazan" , "Kacamz" , 40);

        System.out.println(hasta);
    }
}
