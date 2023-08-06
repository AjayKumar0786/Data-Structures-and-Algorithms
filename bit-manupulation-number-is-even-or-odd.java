public class Main{
    
    public static void oddOrEven(int n){
        int bitMask=1;
        
        //even number
        if((n & bitMask) ==0){
            System.out.println("even");
        }else{
            
        //odd number
           System.out.println("odd"); 
        }
    }
    public static void main(String[]args){
        
        oddOrEven(3);
        oddOrEven(7);
        oddOrEven(10);
        
    }
}