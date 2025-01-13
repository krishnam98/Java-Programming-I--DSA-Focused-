public class rodCutting {

    public static void rodcuttingf(int length[],int price[],int rodlength){
        int dp[][]=new int[length.length+1][rodlength+1];
        for(int i=0;i<dp.length;i++){
           dp[i][0]=0;
        }

         for(int j=0;j<dp[0].length;j++){
                dp[0][j]=0;
            }

            for(int i=1;i<dp.length;i++){
                 for(int j=1;j<dp[0].length;j++){

                    if(length[i-1]<=j){// valid
                        //include
                        int ans1=price[i-1]+dp[i][j-length[i-1]];
                        //exclude
                        int ans2=dp[i-1][j];

                        dp[i][j]=Math.max(ans1,ans2);
                    }
                    else{//invalid
                         
                        //exclude
                        dp[i][j]=dp[i-1][j];
                    }
                
                }
            }
            System.out.println(dp[dp.length-1][dp[0].length-1]);

    }
    public static void main(String args[]){
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int rodlength=8;
        rodcuttingf(length, price, rodlength);
    }
    
}
