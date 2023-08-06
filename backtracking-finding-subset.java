public class Main{
    
    public static void findSubset(String str, String answer, int i){
         //base case 
         if(i==str.length()){
             if(answer.length()==0){
                 
                 System.out.println("null");
             }else{
               System.out.println(answer);  
             }
             
             
             return;
         }
         
         // recursion
         //yes
         findSubset(str, answer+str.charAt(i), i+1);
         
         
         
         //no 
         findSubset(str, answer, i+1);
        
    }
    
    
    public static void main(String[]args){
        String str = "abc";
        findSubset(str, " ", 0);
    }
}