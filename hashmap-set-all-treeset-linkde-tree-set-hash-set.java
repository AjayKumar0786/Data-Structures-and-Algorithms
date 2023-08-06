import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Bihar");
        city.add("Mumbai");
        city.add("Punjab");
        city.add("Haryana");
        System.out.println(city);
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bihar");
        lhs.add("Mumbai");
        lhs.add("Punjab");
        lhs.add("Haryana");
        System.out.println(lhs);
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Bihar");
        ts.add("Mumbai");
        ts.add("Punjab");
        ts.add("Haryana");
        System.out.println(ts);
    }
    
    
}