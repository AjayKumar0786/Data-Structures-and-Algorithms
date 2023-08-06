import java.util.*;

public class Main{
    public static void main(String[]args){
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("india", 50);
        hm.put("china", 150);
        hm.put("indonesia", 60);
        hm.put("bhutan", 70);
        hm.put("us", 55);
        
        //iterate 
        Set<String> keys = hm.keySet();
        System.out.println("keys");
        
        for(String k: keys){
            System.out.println("Key=" + k +",value= "+ hm.get(k) );
        }
        
    }
}