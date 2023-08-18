package For_Each_Loop;

public class C07 {
    public static void main(String[] args) {
        String word = "programming";
        char [] letters = word.toCharArray();
        System.out.println("Letters in the word");

        for (char each: letters
             ) {
            System.out.print(each + " ");
        }
    }
}
