public class Main{
    
   public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.Next = null;
            
        }
    }
    
    public static Node head;
    public static node tail;
    public static int size;
    
//add node in first
    public void addFirst(int data){
        
          // Step 1 - create new node 
        Node newNode = new Node(data);
        size ++;
        
        if(head = null){
            head = tail = newNode;
            return ;
        }
        
        // step 2 - new node next = head 
        newNode.next = head; // linking one node to another node 
        
        //step 3 = head = newNode ;
        head = newNode;
        
    }
    
//add node in last
    public void addLast(int data){
        
        //step 1 = create new Node
        Node newNode = new Node(data);
        size ++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        
        // step 2 = tail.next = new Node;
        tail.next = newNode;
        
        
        //step 3 = 
        tail = newNode;
    }
    
    public void print(){
        
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        
        Node temp = head;
        
        While(Temp != null){
            
            System.out.println(temp.data+ " ");
            
            temp = temp.next;
        }
        
       System.out.println();
        
    }
    
//add in Middle 
    
    public void add(int idx, int data ){
        Node newNode = new Node(data);
        Node temp = head;
            int i = 0;
            
            While(i<idx -1){
                temp = temp.next;
                i++
            }
            
            //i = idx -1; temp --> prev
            
            newNode.next = temp.next;
            
            size ++
            temp.next = newNode;
            
    }
    
    
//remove first element from linked list 
    public int removeFirst(){
        
        //special Cases 
        if(size == 0){
            System.out.println("Linkedlist is empty");
            return Integer.Max_VALUE;
            
        }else if(size ==1 ){
            int val = head.data;
            head = tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
        
    } 
    
    public int removeLast(){
        if(size ==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail=null;
            size =0;
            return val;
        }
        
        //prev i =size-2 (second last element)
        Node prev = head ;
        for(int i=0; i<size-2; i++){
            prev = prev.next; 
        }
        
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
//Searchin in linked list linearly iteratively  = tc =O(n)
    public int itrSearch(int key){
        Node temp = head ;
        int i =0;
        
        while(temp !=key){
            if(temp.data == key){
                return i;
            }
            
            temp = temp.next;
            i++;
        }
        
        //key not found 
        return -1;
    }
    
    
    
//Recursive search   tc = O(n)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        
        if(head.data == key){
            return 0;
        }
        
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        
        return idx+1;
        
        
    }
    public int recSearch(int key){
        return helper(head, key);
        
    }
    
//Reverse a linked LinkedList TC = o(n)
    
    public void reverse(){
        
        Node prev = null;
        Node curr = tail = head;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        
    }
    
// To know the linked list is cyclic or not  - floides cycle finding algorithm
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;    //+1
            fast = fast.next.next; //+2
            if(slow = fast){
                
                return true; //cycle existing 
            }
            
        }
        
        return false; // cycle does not exist 
        
    }
   
 // Remove cycle from the cyclic linked list 
    
    public static void removeCycle(){
        
        // detact cycle 
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            boolean cycle =false;
            
            if(fast == slow){
                cycle =true;
                break;
            }
            
        }
        
        if(cycle == false){
            return;
        }
        
        
        // find meeting point 
        slow = head;
        Node prev = null; // last node will be stored 
        
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        
        
        //remove cycle - last.next = null
        prev.next = null;
    }
    
    
    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        
        //element add in first 
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        
        //element add in last 
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        
        //element add in middle 
        ll.add(2, 3);
        
        //printing size of linked list
        ll.print() // 1->2->3->4->5
        System.out.println(ll.size); //print 5
        
        
        //remove first from linked list 
        ll.removeFirst();
        ll.print();
        
        
        //remove last from linked list
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        
        //searching in linked list iteratively
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        
        
        //search in linked list recursively
        ll.print();
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        
        //reverse linked list 
        ll.print();
        ll.reverse();
        ll.print();
        
        
        //To Know linked list is cyclic or not 
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        
        System.out.println(isCycle());
        
        
        //Remove cycle from the linked list
        head = new Node(1);
        head.next = new Node(2);
        
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        
        System.out.println(isCycle());
        removeCycle();
        System.out.println(removeCycle());
        
        
        
       
        
        
        
        
        
    }
}