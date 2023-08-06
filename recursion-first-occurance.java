public class Main{
    
    public static int arrayOfRecurance(int arr[], int key, int i){
        
        if (i==arr.length){
            
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return arrayOfRecurance(arr, key, i+1);
        
    }
    public static void main(String[]args){
        
        int arr[]={2, 4, 5, 6, 7,3};
        
        System.out.print(arrayOfRecurance(arr, 5, 0));
        
        
        
        
    }
}