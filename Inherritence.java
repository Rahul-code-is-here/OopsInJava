package OOPsInJava;

public class Inherritence {
    public static void main(String[] args){
        Fish shark=  new Fish();
        shark.eat();
    }
}
class animals{
    String colour;
    String name;
    void eat(){
        System.out.println("eats");
    }
    void beathe(){
        System.out.println("breaths");
    }
}

class Fish extends animals{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}
