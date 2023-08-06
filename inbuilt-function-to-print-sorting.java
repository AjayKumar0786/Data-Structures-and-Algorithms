import java.util.Arrays; //first need to import this package 

public class Main
{
    
    //method to print array 
    
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
       }
       
       System.out.println();
   }
    
    
	public static void main(String[] args) {
		int arr[]={1, 3, 4, 5, 6, 8};
		
         Arrays.sort(arr);  // 1st method    2nd ly write this function for sort array   
		
         Arrays.sort(arr, 0, 3);  //2nd method 
		
		printArray(arr);   // function to call for print sorted array
	}
}

