package For_Each_Loop;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int factorial = 1;

        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        System.out.println("factoriel of " + number + " is " + factorial);
    }
}
