import java.util.Collections;

public class Main{

    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i]);
        }
        
        System.out.println();
    }

    public static void main(String[]args){
        Integer arr[]={1, 2, 3, 4, 5};
        
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
        
        
    }
}