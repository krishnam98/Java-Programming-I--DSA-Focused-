public class wildcard {
    public static void matching(String s,String p){
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        // s="valid"; p="";
        for(int i=1;i<=n;i++){
            dp[i][0]=false;
        }
        // s=""; p="valid";
        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
            // else=false

        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                // equal characters & '?'
                if(s.charAt(i-1)== p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                // last character is '*'
                if(p.charAt(j-1)=='*'){
                    // ignore it i.e. '*' matches with empty sequence
                    boolean ans1=dp[i][j-1];
                    // keep it i.e. '*' can match with current char of s then with next char also then a whole sequence
                    boolean ans2=dp[i-1][j];

                    dp[i][j]=ans1||ans2;
                }
            }
        }

       System.out.println(dp[dp.length-1][dp[0].length-1]);

    }
    public static void main(String args[]){
        String txt="abc";
        String pattern="**b?*";
        matching(txt, pattern);

    }
    
}
