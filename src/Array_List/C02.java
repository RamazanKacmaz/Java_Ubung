package Array_List;

import java.util.ArrayList;

public class C02 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers");

        for (int num: numbers
             ) {
            System.out.println(num);
        }
        System.out.println("-----------------------------");
        numbers.set(1,25);

        System.out.println("After updating: "+ numbers);
        System.out.println("_____________________________________");
        for (int num2: numbers
             ) {
            System.out.print(num2 + "\n");
        }
        System.out.println("________________________________");
        System.out.println("Nuber of elements : " + numbers.size());

        System.out.println("____________________");

        numbers.remove(0);

        System.out.println("After removing first element");

        for (int num:numbers
             ) {
            System.out.println(num);
        }

        numbers.clear();;

        System.out.println("After clearing the arrays");
        for (int num:numbers
             ) {
            System.out.println(num);
        }



    }
}
