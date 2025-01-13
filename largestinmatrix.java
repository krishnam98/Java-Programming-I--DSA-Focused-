public class largestinmatrix{
    public static int largest(int matrix[][]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest=Math.max(largest,matrix[i][j]);
            }
        }

        return largest;
    }

    public static int smallest(int matrix[][]){
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                smallest=Math.min(smallest,matrix[i][j]);
            }
        }
        return smallest;

    }

    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {35,45,54,50},
                        {37,48,57,60},
                        {23,77,90,65}};
                        System.out.println(largest(matrix));
                        System.out.print(smallest(matrix));
    }
}