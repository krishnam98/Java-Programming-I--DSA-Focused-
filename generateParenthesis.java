import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    
    public static List<String> generateParenthesis(int n) {
        @SuppressWarnings("unchecked")
        List<String> dp[]=new List[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=new ArrayList<>();
        }
        dp[0].add("");
        dp[1].add("()");
        String ans="";
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                
                for(int k=0;k<dp[j].size();k++){
                    String str="(";
                    str+=dp[j].get(k);
                    str+=")";
                 String str2="";
                for(int m=0;m<dp[i-j-1].size();m++){
                    str2+=dp[i-j-1].get(m);
                    ans=str+str2;
                    dp[i].add(ans);
                    str2="";
                    ans="";
                    
                }
                 str="";
                }
                
               
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(generateParenthesis(n));
    }
}
    

