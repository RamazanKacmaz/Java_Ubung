package Constructor;

public class Person {
    public String name;
    public int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return name + "is " + age + " years old. ";
    }
}
