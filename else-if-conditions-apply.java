import java.util.*;
public class Main{
    public static void main(String[]args){
       
       Scanner sc=new Scanner(System.in) ;
       
       int age =sc.nextInt();
       
       if(age>=18){
           System.out.print("the purson is adult");
       }
       
       else if (age>=13  && age<=18){
           
           System.out.print("The persone is teenager");
       }else{
           System.out.print("The purson is note adult");
       }
        
    }
        
}