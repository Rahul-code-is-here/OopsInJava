package OOPsInJava;

public class Overriding {
   public static void main(String[] args){
       deer d1= new deer();
       d1.eat();
   }
}
class Animals{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer{
    void eat(){
        System.out.println("eat grass");
    }
}