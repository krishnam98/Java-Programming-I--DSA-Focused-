public class twoDQ1 {
    public static int print7(int matrix[][]){
        // brute force
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        return count++;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25}};
        System.out.print(print7(matrix));

    }
    
}
