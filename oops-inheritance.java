public class Main{
    public static void main(String[]args){
        
        fish shark = new fish(); // making object
        shark.eat();         // function call
        
        
        
    }
}

//Super class 
class Animal{
    String colour;
    
    void eat(){
        System.out.println("eats");
    }
    
    void breath(){
        System.out.println("breath");
    }
}

class fish extends Animal{
    int fins;
    
    void swim(){
        System.out.println("Swims");
    }
}



