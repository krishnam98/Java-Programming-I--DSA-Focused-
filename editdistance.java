public class editdistance {
    public static void editdist(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];

                }
                else{
                    int ans1=dp[i][j-1];
                    int ans2=dp[i-1][j];
                    int ans3=dp[i-1][j-1];

                    int ans=Math.min(ans1,ans2);
                    dp[i][j]=Math.min(ans,ans3)+1;
                }
            }
        }

        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
    public static void main(String args[]){
        String str1="intention";
        String str2="execution";
        editdist(str1, str2);

    }
    
}
