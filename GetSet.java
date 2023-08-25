package OOPsInJava;

public class GetSet {
     public static void main(String[] args){
         Pen p1 = new Pen();
         p1.setColour("BLUE");
         System.out.println(p1.getColour());
         p1.setTip(5);
         System.out.println(p1.getTip());
         p1.setColour("Yellow");
         System.out.println(p1.getColour());


     }
}
class  Pen{
    private int tip;
    private String colour;

    String getColour(){
        return this.colour;
    }
    int getTip(){
        return this.tip;
    }

    void setColour(String colour){
        this.colour=colour;
    }
    void setTip(int tip){
        this.tip=tip;
    }

}
