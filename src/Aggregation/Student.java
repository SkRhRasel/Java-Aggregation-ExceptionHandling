package Aggregation;

public class Student {
    String name;
    int id;



    public static void main(String[] args){
        Student student = new Student();
        student.show_student();
    }

    private void show_student() {
        name = "Rokib";
        id = 1;
        Subjects s =new Subjects();

        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Subject 1: " +s.bangla);
        System.out.println("Subject 2: " +s.english);
    }
}
