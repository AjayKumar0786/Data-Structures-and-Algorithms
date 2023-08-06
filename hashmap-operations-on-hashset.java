import java.util.HashSet;

public class Main{
    public static void main(String[]args){
        
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(1);
         hs.add(2);
          hs.add(3);
           hs.add(4);
            hs.add(1);
             hs.add(2);
              hs.add(3);
              
    System.out.println(hs);
    
   if(hs.contains(3)){
       System.out.println("yes contains");
    }
    
    if(hs.contains(5)){
        System.out.println("not contain");
    } 
    
    hs.remove(2);
    System.out.println(hs);
    
    System.out.println(hs.size());
    hs.clear();
    
    System.out.println(hs.isEmpty());
    
    
    
    
        
        
        
        
    }
}