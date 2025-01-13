public class kadanes {
    public static void kadanesalgo(int numbers[]){
        int t=0;
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            if(currsum>max){
                max=currsum;
            }
        }
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]<0){//checks all are negative
               t++;
            }
               if(Math.abs(numbers[j])<min){ //gives minimum value
                   min=numbers[j];
               }
           }
           if(t==numbers.length&&max==0){
               max=min;
           }
        System.out.println();
        System.out.print(max);
    }

    public static void main(String args[]){
        int numbers[]={-1,-2,-3,-4};
        kadanesalgo(numbers);
    }
    
}
