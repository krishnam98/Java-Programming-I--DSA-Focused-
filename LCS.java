public class LCS {
    public static int Lcs(String str1,int n,String str2,int m){
        if(n==0||m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return (1+Lcs(str1,n-1,str2,m-1));
        }
        else{
            int ans1=Lcs(str1,n-1,str2,m);

            int ans2=Lcs(str1,n,str2,m-1);

            return Math.max(ans1,ans2);

        }
    }

    public static int LcsMemo(String str1,int n,String str2,int m,int dp[][]){
        if(n==0 ||m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

       else{ 
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            dp[n][m]=1+LcsMemo(str1, n-1, str2, m-1, dp);
            return dp[n][m];
        }
        else{
            int ans1=LcsMemo(str1, n-1, str2, m, dp);
            int ans2=LcsMemo(str1, n, str2, m-1, dp);
            dp[n][m]=Math.max(ans1, ans2);
            return dp[n][m];
        }
    }

    }

    public static void LcsTab(String str1,int n,String str2,int m){
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][0]=0;
                dp[0][j]=0;
            }
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
               if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
               }
               else{
                int ans1=dp[i-1][j];
                int ans2=dp[i][j-1];

                dp[i][j]=Math.max(ans1, ans2);
               }
            }
        }

        System.out.println(dp[dp.length-1][dp[0].length-1]);


    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="ace"; 
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        // System.out.println(LcsMemo(str1, str1.length(), str2, str2.length(),dp));
        LcsTab(str1, str1.length(), str2, str2.length());

    }
    
}
