import java.util.*;

public class MCM {
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;
        }

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=mcm(arr,i,k); //set1  [Ai,.....Ak]
            int cost2=mcm(arr,k+1,j); //set2  [A(k+1),.....Aj]

            //  operations=a*b*d (sizes of materices) 
            int cost3= arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(finalcost,ans);
        }
        return ans;
    }

    public static int mcmMemo(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        else{
            int ans=Integer.MAX_VALUE;
            for(int k=i;k<j;k++){
                int cost1=mcmMemo(arr,i,k,dp); //set1  [Ai,.....Ak]
                int cost2=mcmMemo(arr,k+1,j,dp); //set2  [A(k+1),.....Aj]

                //  operations=a*b*d (sizes of materices) 
                int cost3= arr[i-1]*arr[k]*arr[j];
                int finalcost=cost1+cost2+cost3;
                ans=Math.min(finalcost,ans);
            }
            dp[i][j]=ans;
            return ans;
        }
    }

    public static int mcmTab(int arr[]){
        int n =arr.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<dp.length;i++){
            dp[i][i]=0;
        }
        for(int len=2;len<n;len++){
            for(int i=1;i<=n-len;i++){
                int j=len+i-1;
                int ans=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    int finalcost=cost1+cost2+cost3;
                    ans=Math.min(finalcost,ans);
                }
                dp[i][j]=ans;

            }
        }

        return dp[1][n-1];  //FINAL ANSWER


    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int cost=mcmTab(arr);
        System.out.println(cost);


    }
    
}
