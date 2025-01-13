public class NQueen {
    public static boolean isSafe(char board[][],int row,int col){
       //vertically up
       for(int i=row;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
       }

    //    diagonally left
    for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }

    // diagonally right
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }

    return true;

    }

    public static void printBoard(char board[][]){
        System.out.println("------CHESS BOARD------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
static int count=0;
    public static void nQueen(char board[][],int row){

        //base case
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';    //backtracking step
            }
        }

    }

    public static void main(String args[]){
        char board[][]=new char [4][4];
        // initializing
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                board[i][j]='X';
            }
        }

        nQueen(board, 0);
        System.out.print("no. of solutions= "+count);

    }
    
}
