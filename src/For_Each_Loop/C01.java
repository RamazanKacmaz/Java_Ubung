package For_Each_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        /*Java'daki for-each döngüsü, bir diziyi veya bir koleksiyonu (örneğin ArrayList, Set) üzerinde dolaşmak için
        kullanılan bir döngü yapısıdır. Bu döngü sayesinde dizi veya koleksiyonun her elemanına sırayla erişebilirsiniz,
        böylece her elemanı işlemek için tekrarlayan kod blokları yazabilirsiniz.
                For-each döngüsünün temel yapısı şu şekildedir:

        for (veriTipi eleman : diziVeyaKoleksiyon) {
            // Eleman üzerinde yapılacak işlemler
            Burada:

            veriTipi, dizinin veya koleksiyonun içinde bulunan elemanların veri tipini belirtir.
            eleman, dizi veya koleksiyonun içindeki her elemanı temsil eden geçici bir değişkendir.
            diziVeyaKoleksiyon, üzerinde dolaşılacak olan dizi veya koleksiyonun adını temsil eder.*/

        int [] num = {1,2,3,4,5};

        for (int each:num
             ) {

        }
        System.out.println(Arrays.toString(num));

    }
}
