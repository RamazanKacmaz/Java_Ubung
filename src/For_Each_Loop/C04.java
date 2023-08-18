package For_Each_Loop;

public class C04 {
    public static void main(String[] args) {

        String messsage = "Hello, world!";
        System.out.println(messsage);

        for (char each:messsage.toCharArray()
             ) {
            System.out.print(each + " ");
        }
    }
}
