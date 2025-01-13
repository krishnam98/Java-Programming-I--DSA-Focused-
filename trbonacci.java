public class trbonacci {
    public static void printSeries(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void findTribonacci(int n){
        if(n==0){
            System.out.println(0);

        }
        if(n==1 || n==2){
            System.out.println(1);
        }
        // creation
        int dp[]=new int [n+1];
        // initialization
        dp[0]=dp[1]=0;
        dp[2]=1;
        // filling
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        // print
        printSeries(dp);

    }
    public static void main(String args[]){
        int n=5;
        findTribonacci(n);

    }
    
}
