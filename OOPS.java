package OOPsInJava;

public class OOPS {
    public static void main(String[] args){
        pen p1=new pen();  //new keyword heap ma memory roki leshe p1 mate
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);

        BankAccount Ba1 = new BankAccount();
        Ba1.username="Rahul";
        Ba1.setPassword("abcd");
    }
}

class pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color= newcolor;
    }
    void setTip(int newtip){
         tip=newtip;
    }
}

class Student{
    String name;
    float percentage;
    int age;
    void calcPercentage(int phy,int maths, int chem){
        percentage=(phy+chem+maths)/3;
    }
}

class BankAccount{
  public String username;
   private String password;
  public void setPassword(String pwd){
       password=pwd;
   }
}