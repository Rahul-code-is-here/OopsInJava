package OOPsInJava;

public class Abstract {
    public static void main(String[] args){
       /* hourse h1= new hourse();
        h1.eat();
        h1.walk();
        System.out.println(h1.colour);

        chicken c1= new chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.colour);*/
        sorthi myhourse= new sorthi();
        // Animals1 ->hourse ->sorthi
    }
}
 abstract class Animals1 {
    String colour;
    Animals1(){
        colour="brown";  // defult colour brown aavshe in every animals
        System.out.println("Animals constructor calls");

    }
    void eat(){
        System.out.println("animals eat:");
    }
    abstract void walk();
 }
 class hourse extends Animals1{
    hourse(){
        System.out.println("hourse constructor called");
    }
    void setcolour(){
        this.colour="black";
    }
    void walk(){
        System.out.println("walk with 4 legs");
    }
 }
 class sorthi extends hourse{
    sorthi(){
        System.out.println("sorthi constructor called");
    }
        }
 class chicken extends Animals1{
    void setcolour(){
        this.colour="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
 }