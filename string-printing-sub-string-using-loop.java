public class Main{
    
    public static String substring(String str, int si, int ei){
        String substr=" ";
        
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        
        return substr;
    }
    public static void main(String[]args){
        
        String str = "HelloWorld";
        
       
       
       System.out.println(substring(str, 1, 5));     // method 1
       
      // System.out.println(str.substring(0, 5));         //method 2 for using this method there is no nee to to call above method in main function
        
        
        
    }
}
