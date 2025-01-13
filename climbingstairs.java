public class climbingstairs {
    public static int countways(int n){
        if(n==0 || n==1){
            return 1;
        }
        return countways(n-1)+countways(n-2);
    }

    public static int countwaysMEMO(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
       
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=countwaysMEMO(n-1,dp)+countwaysMEMO(n-2,dp);
        return dp[n];
    }

    public static int countwaysTab(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(countwaysTab(n));

    }
    
}
