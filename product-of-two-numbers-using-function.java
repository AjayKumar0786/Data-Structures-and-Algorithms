import java.util.*;

public class Main{
    
    public static int product(int a, int b){
        
        int product =a*b;
        
        System.out.print(product);
        
        return product;
    }
    
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    product(a, b);
    
    }
}