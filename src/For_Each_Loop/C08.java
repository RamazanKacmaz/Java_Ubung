package For_Each_Loop;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {
        int [] numbers = {7,2,9,1,5};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array " + Arrays.toString(numbers));
    }
}
