package OOPsInJava;

public class ConstructerInJava {
       public static void main(String[] args){
           Student1 s1 = new Student1("Rahul");
           // Student1 s1 = new Student();
           System.out.println(s1.name);
       }
}
class Student1{
    String name;
    int roll;

    Student1(String name){   //constructor
       this.name= name;
       //System.out.println("Constructor is called!!");
    }
}