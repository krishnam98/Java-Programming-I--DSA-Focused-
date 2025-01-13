public class btQ1 {
   public static boolean isSafe(int maze[][],int x,int y){
  return(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
   }


   public static boolean mazesolveutil(int maze[][],int sol[][],int x,int y){
    if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
        sol[x][y]=1;

        return true;
    }
    if(isSafe(maze, x, y)){
        if(sol[x][y]!=0){
            return false;
        }
        sol[x][y]=1;
        if(mazesolveutil(maze,sol,x+1,y)){
            return true;
        }
        if(mazesolveutil(maze,sol,x,y+1)){
            return true;
        }

        sol[x][y]=0;
        return false;
        
    }
    return false;

   }

   public static boolean mazesolve(int maze[][]){
    int N=maze.length;
    int sol[][]=new int [N][N];

    if(mazesolveutil(maze, sol, 0, 0)==false){
        System.out.print("solution does not exist");
        return false;
    }

    System.out.println("solution exists");
    printmaze(sol);
    return true;
   }

   public static void printmaze(int maze[][]){
    for(int i=0;i<maze.length;i++){
        for(int j=0;j<maze.length;j++){
            System.out.print(maze[i][j]);
        }
        System.out.println();
    }
   }

   public static void main (String args[]){
    int maze[][]={{1,1,1,1,1},
{0,1,0,1,1},
{1,1,1,1,1},
{1,1,1,1,1},
{1,0,1,1,1}};

mazesolve(maze);
   }


    
}
