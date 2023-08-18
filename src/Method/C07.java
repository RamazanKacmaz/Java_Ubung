package Method;

public class C07 {

    static void multiply(int num1 , int num2){
        int result = num1 * num2;
        System.out.println("Sonuc : " + result);
    }

    static void power(double base , int exponent){
        double result = Math.pow(base,exponent);
        System.out.println("Sonuc : " + result);
    }

    public static void main(String[] args) {

        int x = 5 ;
        int y = 3 ;

        multiply(x,y);

        double base = 2.0;
        int exp = 4;
        power( base, exp);
    }
}
