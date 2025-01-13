import java.util.*;
public class twoDQ2alter {
 
    public static int rowsum(int matrix[][],int number){
        int sum=0;
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[number-1][i];
        }
        return sum;
    }


// DRIVER CODE
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,5},  //0
                        {6,7,8,9,10},  //1
                        {11,12,13,14,15},//2
                        {16,17,18,19,20},//3
                        {21,22,23,24,25}};//4
                        Scanner sc=new Scanner(System.in);
                        // entering the row number
                        System.out.print("ENTER ROW NUMBER: ");
                        int number=sc.nextInt();
                        // printing result
                        System.out.print("Sum of desired row is: "+ rowsum(matrix, number));

    }
    
}
