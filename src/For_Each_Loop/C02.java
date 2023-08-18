package For_Each_Loop;

import java.util.ArrayList;

public class C02 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Grapes");

        for (String each:fruits
             ) {
            System.out.println("I like " + fruits);
        }
    }
}
