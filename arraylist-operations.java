import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        
        ArrayList<Integer>list=new ArrayList<>();
        
        list.add(1);    //TC = 0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.add(1, 9);   // new added list in particular index
        
        System.out.println(list);
        
        //Get Operation - TC = 0(1)
        int element = list.get(2);
        System.out.println(element);
        
        //Remove element - TC =0(1)
        list.remove(2);
        System.out.println(list);
        
        //Set element at Index 
        list.set(2, 10);
        System.out.println(list);
        
        // COntain Elemt or not check
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        
        
        
        
        
    }
}