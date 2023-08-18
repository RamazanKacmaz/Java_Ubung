package For_Each_Loop;

public class C03 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        int sum = 0;

        for (int  each:numbers
             ) {
            sum += each;
        }
        System.out.println(sum);
    }


}
