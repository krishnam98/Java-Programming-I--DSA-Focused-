public class twoDQ3 {
    public static void transpose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        // making a new matrix;
       int arr[][]=new int [m][n];
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               arr[j][i]=matrix[i][j];
                  
            }
            

        }
        printMatrix(arr);
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6}};
                        transpose(matrix);

                       

    }
    
}
