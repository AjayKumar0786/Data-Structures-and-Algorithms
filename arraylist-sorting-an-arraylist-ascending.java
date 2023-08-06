import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[]args){
        
        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(9);
        
        System.out.println(list);
        Collections.sort(list);     //Ascending order
        System.out.println(list);
        
        //descending order 
        Collections.sort(list, Collections.reverseOrder()); //descending order me sort 
        System.out.println(list);
        
        
        
        
        
    }
}