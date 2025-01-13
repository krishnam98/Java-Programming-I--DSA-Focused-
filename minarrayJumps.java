import java.util.*;

public class minarrayJumps {
    public static int findJumps(int arr[]){
        int n=arr.length;
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int steps=arr[i];
            // jumps
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                ans=Math.min(ans,dp[j]+1);

            }
            dp[i]=ans;
        }
        if(dp[0]!=-1){
            return dp[0];
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,3,1,1,4};
        int Minjumps=findJumps(arr);
        System.out.println(Minjumps);

    }
    
}
