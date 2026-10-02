public class oops {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="John";
        s1.age=20;
        s1.rollno=101;
        s1.printInfo();
    }
}
class student{
    String name;
    int age;
    int rollno;
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollno);
    }
}