package Syntax29;

public class Student {
    String name;
    String address;
    int age;
    Student(String studentName, String studentAddress){
        name= studentName;
        address= studentAddress;

    }
    Student(int studentage, String studentAddress, String studentName){
        name= studentName;
        address= studentAddress;
        age = studentage;

    }
    void DisplayInfo(){
        System.out.println("Student Name is"+name+"  Student address is "+address+ "Student age"+age);

    }

    public static void main(String[] args) {
        Student student = new Student("wahab","4504 wlkjskdlfj");
        student.DisplayInfo();
    }
}
