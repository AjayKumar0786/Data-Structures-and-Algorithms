import java.util.LinkedList;  //java collection frame work -> optimized 

public class Main{
    
    public static void main(String[]args){
        //Create - objects 
        LinkedList<Integer>ll = new LinkedList<>();
        
        // add 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        
        System.out.println(ll);
        
        //remove 
        ll.removeLast();
        ll.removeFirst();
        
        System.out.println(ll);
        
        
        
    }
}