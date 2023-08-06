import java.util.PriorityQueue;

public class Main{
    
    public static void main(String[]args){
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        pq.add(3);  // Tc = 0(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek());  // 0(1)
            pq.remove();    //0 (log n)
        }
        
        
        
    }
}