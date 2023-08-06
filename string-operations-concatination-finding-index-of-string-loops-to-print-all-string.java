
public class Main
{
    // function to print all string in loop
    public static void printString(String str){
        for(int i=0; i<str.length(); i++){
            
            System.out.print(str.charAt(i)+ " ");
        }
        
        System.out.println();
        
    }
	public static void main(String[] args) {
	    
	//Finding string length
	    
		   //String name ="Ajay kumar Sharma";
		 
		   // System.out.print(name.length());
		 
	//Concatination - Means joining two strings together 
	       
	       String firstName ="Ajay";
	       String lastName ="Sharma";
	       
	       String fullName=firstName+ " "+ lastName;
	       
	       //System.out.print(fullName);          //printing full name 
	       
	       //System.out.print(fullName.charAt(3));  // printing index of string in ajay, y is at 3rd 
	
	       printString(fullName);
	   
	}     
	       
}
