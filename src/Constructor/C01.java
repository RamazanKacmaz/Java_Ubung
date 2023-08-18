package Constructor;

public class C01 {
    private  String name ;
    private  int age ;

    public C01(){
        name = "Bilinmeyen";
        age = 0;

    }

    public C01(String name , int age){
        this.name =name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        C01 person1 = new C01();

        System.out.println("Kisi 1 " + person1.getName() + " , " + person1.getAge());

        C01 person2 = new C01("Ramazan", 42);

        System.out.println("kisi 2 :" + person2.getName() + ", " + person2.getAge());

    }

}
