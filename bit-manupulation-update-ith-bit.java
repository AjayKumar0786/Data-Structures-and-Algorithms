public class Main{
    
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            
            return setIthBit(n, i);
        }
    }
    public static void main(String [] args){
        
       System.out.print(updateIthBit(10, 2, 1));
    }
}