public class btQ3{
    public static boolean isSafe(int chess[][],int x,int y){
        if(x>=0 && y>=0 && x<chess.length && y<chess.length && chess[x][y]==-1){
            return true;
        }
        return false;
    }

    public static void knightmoves(int chess[][]){
        int x_move[]={2,2,1,-1,-2,-2,-1,1};
        int y_move[]={1,-1,-2,-2,-1,1,2,2};
        int movei=1;
        chess[0][0]=0;


        if(kmovesutil(chess,0,0,x_move,y_move,movei)==false){
            System.out.print("solution does not exists");
            return;
        }

        System.out.print("solution exists");
        printchess(chess);
   
    }

    public static boolean kmovesutil(int chess[][],int x,int y,int x_move[],int y_move[],int movei){
        if(movei==chess.length*chess.length){
            return true;

        }
        for(int i=0;i<8;i++){
            int next_x=x+x_move[i];
            int next_y=y+y_move[i];

            if(isSafe(chess, next_x, next_y)){
                chess[next_x][next_y]=movei;
                if(kmovesutil(chess, next_x, next_y, x_move, y_move, movei+1)){
                    return true;
                }
                else{
                    chess[next_x][next_y]=-1;
                }
               
            }
            
            
            
        }

        return false;
      
    }

    public static void printchess(int chess[][]){
        System.out.println("----chess board----");
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        int chess[][]=new int [8][8];
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                chess[i][j]=-1;
            }
        }
        knightmoves(chess);
    }


}