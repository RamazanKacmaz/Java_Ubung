package For_Each_Loop;

public class C09 {
    public static void main(String[] args) {
        int [] numbers = {12,7,15,22,9,6,13,8};
        System.out.println("Even numbers");

        for (int each:numbers
             ) {
            if (each % 2 == 0){
                System.out.print(each + " ");
            }
        }
        System.out.println("\nOdd numbers");
        for (int each: numbers
             ) {
            if (each % 2 != 0){
                System.out.print(each + " ");
            }
        }
    }
}
