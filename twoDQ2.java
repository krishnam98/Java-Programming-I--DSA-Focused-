public class twoDQ2{
    public static int printsum(int nums[][]){
        int startRow=0;
        int i=startRow+1;
        int sum=0;
       
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];

            }
        return sum;


    }
    public static void main(String args[]){
        int nums[][]={{1,4,9},
                      {11,4,3},
                      {2,2,3}};
                      System.out.print(printsum(nums));
    }
    
}
