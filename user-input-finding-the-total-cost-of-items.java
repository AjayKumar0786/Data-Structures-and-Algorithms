import java.util.*;

public class Main{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
    float a = sc.nextFloat(); //pencil 
    float b = sc.nextFloat(); //pen 
    float c = sc.nextFloat(); //eraser
    
    float cost = a+b+c;
    
    System.out.print("Total cost of items = " + cost + "Rupes");
    }
}