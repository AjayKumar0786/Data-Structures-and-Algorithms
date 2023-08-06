import java.util.*;

public class Main{
    
    public static void main(String args[]){
        
        char ch[]={'a', 'b', 'c', 'd'};     //character array declaration
        
        String str="abcd";                 // String declaration method 1
        String str2 =new String("abcd");   // String declaration method 2  
        
        
        //taking string as input 
        
        Scanner sc =new Scanner(System.in);
        
        String name= sc.nextLine();  //next() - this is taking singe word after gap it dont print
                                     //nextLine() - this is taking whole linew word after gap also
        
        System.out.print(name);
        
        
        
    }
}