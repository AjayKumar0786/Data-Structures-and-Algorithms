import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Bihar");
        city.add("Mumbai");
        city.add("Punjab");
        city.add("Haryana");
        
       Iterator it = city.iterator();
       while(it.hasNext()){
       System.out.println(it.next());
     
     
   //  for(String : city){
    //     System.out.println(city);
     }
        
    }
}