class Student{
    int id;
    String name;
    Student(int i , String n){
        id = i;
        name = n;
    }
    @Override
    public String toString() {  
        return "Student ID: " + id + ", Student Name: " + name;
    }
}
public class Q9 {

    public static void main(String[] args) {
        Student s1 = new Student(191, "Aditya");
        Student s2 = new Student(199, "Ayushi");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}