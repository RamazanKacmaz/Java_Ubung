package C01_C26;

import java.util.*;

public class C10 {
    public static void main(String[] args) {

    Integer [] arr1 = {3,5,7,3,8,9,6,5,4,12};
    Integer [] arr2 = {5,7,9,0,1,14,2,3};

        List<Integer> ortak = new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2:arr2
                 ) {
                if ( each1 == each2  && !ortak.contains(each1)){
                    ortak.add(each1);
                }
            }
        }
        Collections.sort(ortak);
        System.out.println(ortak);
    }

}
