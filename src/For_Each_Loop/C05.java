package For_Each_Loop;

public class C05 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int [] each1:matrix
             ) {
            for (int each2:each1
                 ) {
                System.out.print(each2 + " ");
            }
            System.out.println();
        }
    }
}
