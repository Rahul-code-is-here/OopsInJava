package OOPsInJava;
public class Construct {
    public static void main(String[] args){
        Student2 s1= new Student2();
        Student2 s2 = new Student2("Rahul");
        Student2 s3= new Student2(25);
        //Student s4 = new Student2("rahul", 25);
    }
}
class Student2{
    String name;
    int roll;

    Student2(){
        System.out.println("Construcor is called");
    }
    Student2(String name){
        this.name=name;
    }
    Student2(int roll){
        this.roll=roll;
    }
}