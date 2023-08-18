package For_Each_Loop;

public class C06 {
    public static void main(String[] args) {

        class Student {
            String name;
            int age ;

             Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        Student [] students = {
                new Student("Ali" , 20),
                new Student("Veli", 16),
                new Student("Hamza" , 12)
        };

        for ( Student each:students
             ) {
            System.out.println("Name " + each.name + " age " + each.age);
        }
    }
}
