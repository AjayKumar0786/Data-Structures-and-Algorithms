public class Main{
    
    public static void reverseArray(String str[]){
        
        int first =0, last = str.length-1;
        
        while(first<last){
            
            //swap 
            String temp=str[last];
            str[last]=str[first];
            str[first]=temp;
            
            first++;
            last --;
        }
    }

public static void main (String[] args) {
    
    String str[]={"geegs"};
    
    reverseArray(str);
    for(String i=0; i<str.length; i++){
        
        System.out.print(str[i]+" ");
    }
    
    System.out.println();
}
}
