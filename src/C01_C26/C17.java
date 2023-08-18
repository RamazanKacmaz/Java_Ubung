package C01_C26;

public class C17 {

    public static void main(String[] args) {

        C16 person = new C16();

        person.isim = "Ramazan";
        person.soyisim= "Kacmaz";
        person.yas = 42;
        person.sehir = "Sindirgi";

        System.out.println(person);

        C16 person2 = new C16();
        person2.isim = "Henry";
        person2.soyisim = "Klary";
        person2.yas = 33;
        person2.sehir = "Ulm";

        System.out.println(person2);
    }
}
