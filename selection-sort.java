
public class Main{
    
    public static void selectionSort(int arr[]){
        
         // One by one move boundary of unsorted subarray
        for(int i=0; i<arr.length-1; i++){
            
             // Find the minimum element in unsorted array
            int minPos=i;
            
             for(int j=i+1; j<arr.length; j++){
                 if(arr[minPos]>arr[j]){
                     
                     minPos=j;
                     
                 }
                 
             }
             
             // Swap the found minimum element with the first
            // element
             
             int temp=arr[minPos];
             arr[minPos]=arr[i];
             arr[i]=temp;
        }
        
    }
    
    // Prints the array
     public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
    }
    
    
    //derive code to call the above methods
	public static void main(String[] args) {
	    int arr[]={5, 4, 1, 3, 2};
	    
	   
	     selectionSort(arr);
	     
	      printArray(arr);
	     
		
	}
}
