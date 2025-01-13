public class sumofsubarray {
    public static void printSA(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int tsa=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                 sum =sum+numbers[k];  //sum of subarray
                  
                }
                
                System.out.print(sum+"  ");
                
                if(sum>max){max=sum;}
                if(sum<min){min =sum;}

               

                
                tsa++;
            }
            System.out.println();
        }
        System.out.println("total subarrays: "+tsa);
        System.out.println("maximum value among all: "+max);
        System.out.print("minimum value among all: "+min);
    
       

    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        printSA(numbers);

    }
    
}
