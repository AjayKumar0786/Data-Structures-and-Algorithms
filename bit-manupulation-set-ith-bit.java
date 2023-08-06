public class Main{
    
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        
        return n | bitMask;
        
    }
    public static void main(String[]args){
        
       System.out.print(setIthBit(10, 2));
        
    }
}