package OOPsInJava;
// compile time polymorphisom
public class Overloading {
    public static void main(String[] args){
        calculator c1= new calculator();
        System.out.println(c1.sum(10,12));
        System.out.println(c1.sum((float)1.5, (float)22.5));
        System.out.println(c1.sum(12,22,32));
    }
}
class calculator{
   int sum(int a, int b){
      return a+b;
    }
    float sum(float a, float b){
       return a+b;
    }
    int sum(int a, int b, int c){
       return a+b+c;
    }
}