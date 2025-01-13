public class btQ1alter {
    public static boolean isSafe(int maze[][],int x,int y){
        return(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
         }
      
      
         public static void mazesolveutil(int maze[][],int sol[][],int x,int y){
          if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
              sol[x][y]=1;
              printmaze(sol);
      
              return ;
          }
          if(isSafe(maze, x, y)){
              if(sol[x][y]!=0){
                  return ;
              }
              sol[x][y]=1;
              mazesolveutil(maze,sol,x+1,y);
                  
              
             mazesolveutil(maze,sol,x,y+1);
                
              
      
              sol[x][y]=0;
              return ;
              
          }
          return ;
      
         }
      
        //  public static boolean mazesolve(int maze[][]){
        //   int N=maze.length;
        //   int sol[][]=new int [N][N];
      
        //   if(mazesolveutil(maze, sol, 0, 0)==false){
        //       System.out.print("solution does not exist");
        //       return false;
        //   }
      
        //   System.out.println("solution exists");
        //   printmaze(sol);
        //   return true;
        //  }
      
         public static void printmaze(int maze[][]){
            System.out.println("-----maze-----");
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

      int N=maze.length;
      int sol[][]=new int [N][N];
      
      mazesolveutil(maze, sol, 0, 0);
         }
    
}
