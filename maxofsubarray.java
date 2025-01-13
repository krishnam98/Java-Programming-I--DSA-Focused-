//prefix sum
public class maxofsubarray {
    public static void maxsum(int numbers[]){
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculating prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=numbers[i]+prefix[i-1];
        }
// calculating sum
        for(int i=0;i<numbers.length;i++){//start
            for(int j=i;j<numbers.length;j++){//end
                int sum=0;
                if(i==0){
                    sum=prefix[j];
                }
                else{sum=prefix[j]-prefix[i-1];}
                System.out.print(sum+ " ");
                if(sum>max){
                    max=sum;
                }

                if(sum<min){
                    min=sum;
                }

                
            }
            System.out.println();
        }
        System.out.println("maximum value among sum is: "+max);
        System.out.println("minimum value among sum is: "+min);

    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxsum(numbers);
    }
    
}
