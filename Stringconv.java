public class Stringconv {

    public static int lcs(String str1,int n,String str2,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                   if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                   }
                   else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                   }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static void convertstr(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        

        int lcs_lenght=lcs(str1, n, str2, m);
        // deletion
        int del=n-lcs_lenght;
        // insertion
        int ins=m-lcs_lenght;

        System.out.println("Number of Deletion: "+del);
        System.out.println("Number of Insertion: "+ins);




    }
    public static void main(String args[]){
        String str1="abcd";
        String str2="acc";
        convertstr(str1, str2); 

    }
    
}
