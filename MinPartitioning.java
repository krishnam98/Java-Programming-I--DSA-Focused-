public class MinPartitioning {
    public static void minPart(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int w=sum/2;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;   
        }
        // 0-1Knapsack
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr[i-1]<=j){ //valid
                    //include
                    int ans1=arr[i-1]+dp[i-1][j-arr[i-1]];

                    //exclude
                    int ans2=dp[i-1][j];

                    dp[i][j]=Math.max(ans1,ans2);
                }
                else{//invalid
                    //exclude
                    dp[i][j]=dp[i-1][j];
                    
                }
            }
        }

        int sum1=dp[n][w];
        int sum2=sum-sum1;
        System.out.println(Math.abs(sum1-sum2));
    }
    public static void main(String args[]){
        int arr[]={1,11,6,5};
        minPart(arr);
    }
    
}
