public class coinchange {
    public static void coinChange(int coins[],int sum,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(coins[i-1]<=j){
                    int ans1=dp[i][j-coins[i-1]];
                    int ans2=dp[i-1][j];
                    dp[i][j]=ans1+ans2;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }

        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }

    public static void main(String args[]){
        int coins[]={1,2,3};
        int sum=100;
        int dp[][]=new int [coins.length+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for(int j=1;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        coinChange(coins, sum, dp);

    }
       
}
