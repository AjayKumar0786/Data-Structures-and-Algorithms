public class Main{
    
    public static void swap(int a, int b){
        
        int temp=a;
        a=b;
        b=temp;
        
        System.out.println("A ="+a);
        System.out.println("B ="+b);
        
    }
    
    public static void main(String[]args){
        
        //swap
        
        int a=15;
        int b=20;
        
        swap(a, b);
        
       
        
        
        
        
    }
}