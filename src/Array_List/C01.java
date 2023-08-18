package Array_List;

import java.util.ArrayList;

public class C01 {
    public static void main(String[] args) {
        /*ArrayList sınıfı, Java'da dinamik boyutlu dizileri (dynamic arrays) temsil etmek için kullanılan bir koleksiyon
        sınıfıdır. Bu sınıf, dizilere benzer bir şekilde elemanları depolar, ancak dizilere göre
        daha esnek ve dinamik bir yapı sunar.*/

        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Veli");
        // Belirli bir elemanın indeksini bulma

        int isimindex = names.indexOf("Veli");
        System.out.println(isimindex);

        for (String each: names
             ) {
            System.out.println(each);
        }
        names.remove("Veli");

        System.out.println("After removing Bob");
        for (String each2:names
             ) {
            System.out.println(each2);
        }
    }
}
