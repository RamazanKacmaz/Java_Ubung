package C01_C26;

public class C13 {
    public static void main(String[] args) {

        int [] liste = {1, 3, 12, 25, 56, 35, 89};
        int toplam = 0;

        for (int i = 0; i < liste.length ; i++) {
            toplam += liste[i];
        }
        System.out.println(toplam);


    }


}
