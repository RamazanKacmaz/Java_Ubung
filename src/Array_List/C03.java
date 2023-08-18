package Array_List;

import C01_C26.Student;

import java.util.ArrayList;

public class C03 {
    private  String name;
    public int age ;

    public C03(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Students : " +
                " name = " + name  +
                " age  =  " + age +
                '.';
    }

    public static void main(String[] args) {

        ArrayList<C03>  studentList = new ArrayList<>();

        studentList.add(new C03( "Ali", 20));
        studentList.add(new C03("Zeynep" , 14));
        studentList.add(new C03( "Veli", 25));
        studentList.add(new C03("Dilek" , 16));

        System.out.println("ogrenci Listesi : ");

        for (C03 each: studentList
             ) {
            System.out.println(each);
        }





    }
}
