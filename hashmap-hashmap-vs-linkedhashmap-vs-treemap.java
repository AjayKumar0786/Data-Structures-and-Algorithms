import java.util.*;

public class Main{
    public static void main(String[]args){
         
    //linked hash map giving output in proper order
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 150);
        lhm.put("us", 60);
        lhm.put("nepal", 50);
        lhm.put("bhutan", 70);
    
    //hash map - not giving output in any order 
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 60);
        hm.put("nepal", 50);
        hm.put("bhutan", 70);
        
    // tree Map - in given output keys are sorted 
    
    TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("china", 150);
        tm.put("us", 60);
        tm.put("nepal", 50);
        tm.put("bhutan", 70);
        
        System.out.println(lhm);
        System.out.println(hm);
         System.out.println(tm);
        
        
        
        
        
    }
}