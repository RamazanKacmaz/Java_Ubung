package C01_C26;

public class C21 {
    String  HastaAdi;
    String HastaSoyadi;
    int  Hastayas ;

    int Hastatel ;

    public C21() {
    }

    public C21(String hastaAdi, String hastaSoyadi, int hastayas, int hastatel) {
        HastaAdi = hastaAdi;
        HastaSoyadi = hastaSoyadi;
        Hastayas = hastayas;
        Hastatel = hastatel;
    }

    @Override
    public String toString() {
        return "Hasta Kayit\n" +
                "HastaAdi='" + HastaAdi + '\'' +
                "HastaSoyadi='" + HastaSoyadi + '\'' +
                "Hastayas=" + Hastayas +
                "Hastatel=" + Hastatel +
                '}';
    }
}
