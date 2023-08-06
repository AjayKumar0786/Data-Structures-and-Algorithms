public class Main{
    
    public static void printArr(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    
    public static int quickSort(int arr[], int si, int ei){
        
        if(si>=ei){
            
            return ;
        }
        //pivot as my last element 
        
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // for sorting left part 
        quickSort(arr, pIdx+1, ei);
    }
    
    public static void partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                
                // swap
                
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= tamp;
            }
        }
        
        i++;
        int temp = pivot;
                arr[ei]= arr[i];
                arr[i]= tamp;
                return i;
        
    }
    
    public static void main(String[]args){
        int arr[]={6, 3, 9, 8, 2, 5};
        
        quickSort(arr, 0, arr.length-1);
        
        printArr(arr);
        
        
    }
}