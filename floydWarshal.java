public class floydWarshal {
    static int inf=9999;
    static int v=4;

    public static void floydwarshall(int matrix[][]){
        int sol[][]=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sol[i][j]=matrix[i][j];
            }
        }
        for(int k=0;k<v;k++){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(sol[i][j]>(sol[i][k]+sol[k][j])){
                        sol[i][j]=sol[i][k]+sol[k][j];
                    }

                }
           }
            
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]={{0,3,inf,5},
                        {2,0,inf,4},
                        {inf,1,0,inf},
                        {inf,inf,2,0}};
                        floydwarshall(matrix);

                        

    }
    
}
