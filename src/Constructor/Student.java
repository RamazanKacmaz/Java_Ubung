package Constructor;

public class Student extends Person{


    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId  = studentId;
    }

    public String getStudentInfo(){
        return getInfo()+ "Student ID : " + studentId;
    }

    public static void main(String[] args) {

        Person person = new Person(" Alice ", 30);
        System.out.println(person.getInfo());

        Student student = new Student(" Bob ", 20 , " 123456 ");
        System.out.println(student.getStudentInfo());
    }


}
