public class Main{
    
    public static void nQueens(char board[], int row){
        //base case 
        if(roe==board.length){
            printBoard(board);
            return;
        }
        
        //coloumn loop 
        for(int j=0; j<board.length; j++){
            board[row][j]='Q';
            nQueens(board, row+1);   //function call
            nQueens[row][j]=',';     // backtracking step
        }
    }
    
    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            
            System.out.print();
        }
    }
    
    public static void main(String[]args){
         int n =2; 
         char board [][]=new char[n][n];
         
         //intitialize 
         for(int i=o; i<n; i++){
             for(int j=0; j<n; j++){
                 board[i][j]=',';
             }
         }
        nQueens(board, 0);
        
    }
}