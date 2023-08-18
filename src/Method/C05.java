package Method;

public class C05 {

    public static int add(int num1 , int num2){
        return num1+ num2;
    }

    public static double divide(double num1 , double num2){
        if (num2 != 0){
            return num1/num2;
        }else {
            System.out.println("Sifira bolme hatasi");
            return Double.NaN ;
        }
    }

    public static void main(String[] args) {
        int sum = add(10,5);
        System.out.println("Toplam : " + sum );

        double result = divide(20.0,4.0);
        System.out.println("Bölme sonucu : " + result);

        double result1 = divide(15.0,0.0);
        System.out.println("Gecrsiz bölüm sinucu : " + result1);
    }
}
