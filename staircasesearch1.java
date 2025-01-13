public class staircasesearch1 {
    // TIME COMPLEXITY=O(n+m) {where n&m are number of rows&columns respectively;}
    //bottom left element is taken as starting element
    public static boolean staircase(int matrix[][],int key){
        int row=matrix.length-1;
        int column=0;

        while(row>=0 && column<matrix[0].length){
            if(matrix[row][column]==key){
                System.out.print("Found at: ("+row+","+column+")");
                return true;
            }

            else if(matrix[row][column]>key){
                row--;
            }
            else{column++;}
        }

        System.out.print("NOT FOUND!");
        return false;

    }

    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

                        int key=250;

                        staircase(matrix, key);
    }
    
}
