public class Main{
    
    public static void main(String[]args){
        
        Queen q= new Queen();
        q.moves();
        
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, digonal(in all directions)");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right (move by one )");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("moves digonally");
    }
}