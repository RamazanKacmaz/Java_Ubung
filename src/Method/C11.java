package Method;

public class C11 {
    static int carpim (int num1 , int num2){
        return num1*num2;
    }

    static int kare (int num1){
        return num1*num1;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.println("Sonuc : "+ carpim(x,y));

        int num = 4;
        System.out.println("Sonuc : "+ kare(num));
    }
}
