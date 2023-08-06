import java.util.*;

public class Main{
    public static void main(String[]args){
        
    // Create operation tc = 0(1)
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("india", 50);
        hm.put("China", 150);
        hm.put("us", 100);
        
        System.out.println(hm);
        
    //get operation - tc = 0(1)
    
        System.out.println(hm.get("India"));
      
        System.out.println(hm.get("indonesai"));
      
    //Contains Key tc - o(1)  
      System.out.println(hm.containsKey("india"));      //true
      System.out.println(hm.containsKey("indonesai"));  //false
      
    //remove operation - 0(1)
      
      System.out.println(hm.remove("China"));
      System.out.println(hm);
       
    //print size of HashMap
    
    System.out.println(hm.size());
        
       
        
        
        
        
        
    }
}