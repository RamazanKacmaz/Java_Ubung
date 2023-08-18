package C01_C26;

public class Student {

    String ad ;
    String soyad ;

    int yas ;
    char cinsiyet;

    public Student() {
    }

    public Student(String ad, String soyad, int yas, char cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "===>>" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                '}';
    }
}
