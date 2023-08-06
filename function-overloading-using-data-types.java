public class Main{
    
    public static int calculate(int a, int b){
        
        return a+b;
    }
    
    public static float calculate(float a, float b){
        
        return a+b;
    }
    
    public static long calculate(long a, long b){
        
         return a+b;
    }
    
    
    
    public static void main(String[]args){
        
        System.out.println(calculate(5 , 5 ));
        System.out.println(calculate(3.2f, 2.5f));
        System.out.println(calculate(2, 2));
    }
}