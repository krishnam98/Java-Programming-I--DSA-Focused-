public class LCSubstring {
    public static void lcsubstring(String str1,int n,String str2,int m){
        int dp[][]=new int[n+1][m+1];
        int max=0;

        for(int i=0;i<dp.length;i++){
           dp[0][i]=0;
           dp[i][0]=0;
        }

         for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
               if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
                max=Math.max(max, dp[i][j]);

               }
               else{
                dp[i][j]=0;
               }
               
            }
        }
        System.out.println(max);




    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="abgce";
        lcsubstring(str1, str1.length(), str2, str2.length());

    }
    
}
