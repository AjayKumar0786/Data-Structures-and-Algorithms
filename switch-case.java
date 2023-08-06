import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        
        switch(number){
            
            case 1: System.out.println("milk");
                    break;
            case 2: System.out.println("chai");
                    break;
            case 3: System.out.println("cofe");
                    break;
            default : System.out.println("nothing available");
        }
    }
}