public class zero1knapsack {
    public static int knapsack(int val[],int wt[],int w,int n){
        if(n==0 || w==0){
            return 0;
        }

        else if(wt[n-1]<=w){
            int ans1=val[n-1]+knapsack(val, wt, w-wt[n-1], n-1);

            int ans2=knapsack(val, wt, w, n-1);
            return Math.max(ans1,ans2);
        }

        else{
             return knapsack(val, wt, w, n-1);
        }
    }

    public static int knapsackMemo(int val[],int wt[],int w,int n,int dp[][]){
        if(n==0 || w==0){
            return 0;
        }

        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        else if(wt[n-1]<=w){
            int ans1=val[n-1]+knapsackMemo(val, wt, w-wt[n-1], n-1,dp);

            int ans2=knapsackMemo(val, wt, w, n-1,dp);
            dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];
        }

        else{
             dp[n][w]=knapsackMemo(val, wt, w, n-1,dp);
             return dp[n][w];
        }
    }

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
    }

   

    public static int knapsackTab(int val[],int wt[],int W,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(wt[i-1]<=j){
                    int ans1=val[i-1]+dp[i-1][j-wt[i-1]];

                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];

    }

    public static void unboundedks(int val[],int wt[],int W,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(wt[i-1]<=j){
                    int ans1= val[i-1]+dp[i][j-wt[i-1]];

                    int ans2=dp[i-1][j];

                    dp[i][j]=Math.max(ans1,ans2);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }



    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int n=val.length;
        int dp[][]=new int[val.length+1][w+1];
        // for(int i=0;i<dp.length;i++){
        //     dp[i][0]=0;
        // }

        // for(int j=0;j<dp[0].length;j++){
        //            dp[0][j]=0;
        // }
         
        // System.out.println("Final answer: "+knapsackTab(val, wt, w, dp));
        // System.out.println();
        // System.out.println("Whole Table:- ");
        //  print(dp);
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }

        unboundedks(val, wt, w, dp);

    }
    
}
