public class Main{
    
    public static int calculator(int a, int b){
        
        return a+b;
    }
    
    public static float calculator(float a ,float b, float c){
        
        return a + b + c;
    }
               
    
    
    public static void main(String[]args){
        
        System.out.println(calculator(2, 2));
        
        System.out.print(calculator(2, 1, 2));
        
    }
}