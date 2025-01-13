public class LIP {
    public static boolean isrightSafe(int m[][],int i,int j){
        int M=m[0].length;
        return ((j+1<M) && (m[i][j+1]>m[i][j]));
    } 
    public static boolean isdownSafe(int m[][],int i,int j){
        int N=m.length;
        return ((i+1<N) && (m[i+1][j]>m[i][j]));
    }

    public static int lip(int m[][],int i,int j,int count,int dp[][]){
        if(i==m.length-1 && j==m[0].length-1){
            return count;
        }
        int rightC=0;
        int downC=0;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(isrightSafe(m,i,j)){
             rightC=lip(m,i,j+1,count+1,dp);
        }
        if(isdownSafe(m,i,j)){
             downC=lip(m, i+1, j, count+1,dp);
        }
        if(!isrightSafe(m, i, j) && !isdownSafe(m, i, j)){
            dp[i][j]=count;
            return count;
        }
        else{
            
            return dp[i][j]=Math.max(rightC, downC);
        }
    }
    public static void main(String args[]){
        int N=1;
        int M=1;
        int m[][]={ { 1, 2, 3, 4 },
                    { 2, 2, 3, 4 },
                    { 3, 2, 3, 4 },
                    { 4, 5, 6, 7 } };
                   
        int dp[][]=new int[m.length][m[0].length];   
        System.out.println(lip(m, 0, 0, 1,dp));  
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }   
        System.out.println();  
    }
    
}
