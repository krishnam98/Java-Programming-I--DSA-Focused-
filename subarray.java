public class subarray {
    public static void printingsubarray(int numbers[]){
        int total=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]);
                }
                System.out.print(" ");
                total++;
            }
            System.out.println();
        }
        System.out.print("total subarrays are: "+total);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
      printingsubarray(numbers);
    }
    
}
