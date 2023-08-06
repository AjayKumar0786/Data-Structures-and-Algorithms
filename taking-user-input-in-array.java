import java.util.*;

public class Main{
    public static void main(String[]args){
        
        int marks[]=new int[100];
        
        Scanner sc =new Scanner(System.in);
        
        marks[0]=sc.nextInt(); //physics
        marks[1]=sc.nextInt(); //Chemistry
        marks[2]=sc.nextInt(); //Math
        
        System.out.println("physics = "+ marks[0]);
        System.out.println("Chemistry = "+ marks[1]);
        System.out.println("Math = "+ marks[2]);
        
        // marks[2]=100;
           
           marks[2]=marks[2]+1;
         System.out.println("Math = "+ marks[2]);
         
         System.out.println("length of array = " + marks.length);
         
    }
}