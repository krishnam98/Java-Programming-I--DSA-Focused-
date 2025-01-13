public class diagonalsum {

    // brute force; TIME COMPLEXITY=O(n^2);
    public static int printdiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum=sum+matrix[i][j];
                }

               

            }
        }

        return sum;

    }


    public static int optimisedDiagonalSum(int matrix[][]){

        // optimised; TIME COMPLEXITY=O(n);
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            // primary diagonal sum
            sum+=matrix[i][i];

            // secondary diagonal
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }


    public static void main(String args[]){

        int matrix[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
        System.out.print(optimisedDiagonalSum(matrix));
    }
    
}
