public class Main{
    public static void main(String[]args){
        
        Pen p1 = new Pen();
        
        p1.setColour("blue");
        System.out.println(p1.colour);
        
        p1.setTip(5);
        
        System.out.println(p1.tip);
        
    }
}

 class Pen {
     String colour;
     int tip;
     
     
     void setColour(String newColour){
         colour=newColour;
     }
     
     void setTip(int newTip){
        tip = newTip;
     }
 }