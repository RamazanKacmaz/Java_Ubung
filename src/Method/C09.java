package Method;

public class C09 {

    static  int nummer (){
        return (int) (Math.random()* 100);
    }

    public static void main(String[] args) {

        int random = nummer();
        System.out.println(random);
    }
}
