import java.util.*;

public class targetsumsubsetDP {
    public static boolean targetsumSubset(int nums[],int target,String str,int n){
        if(n==nums.length ||target==0){
            if(target==0){
                System.out.println(str);
                
                return true;

            }
            else{
                return false;
            }
        }

        if(nums[n]<=target){
            Integer i=nums[n];
            boolean d1=targetsumSubset(nums, target-nums[n], str+i.toString(), n+1);

           boolean d2= targetsumSubset(nums, target, str, n+1);
           return d1||d2;
        }
        else{
           return targetsumSubset(nums, target, str, n+1);

        }

    }

    public static boolean targetsumTab(int nums[],boolean dp[][],int target){
      for(int i=1;i<dp.length;i++) {
        for(int j=1;j<dp[0].length;j++) {

            if(nums[i-1]<=j){ //valid
                //include
            boolean v1=dp[i-1][j-nums[i-1]];
            //exclude
            boolean v2=dp[i-1][j];
            dp[i][j]=v1||v2;
           }
          else{ //invalid
            //exclude
             dp[i][j]=dp[i-1][j];
          }

        }

       
        
    }   
     return dp[dp.length-1][dp[0].length-1];


    }

    public static void main(String args[]){
        int nums[]={4,2,7,1,3};
        int targetsum=10;
        
        // boolean ans =targetsumSubset(nums, targetsum,"", 0);
        // System.out.println(ans);
        boolean dp[][]=new boolean[nums.length+1][targetsum+1];
        
        
         for(int i=0;i<dp.length;i++){
            
            dp[i][0]=true;
            
        }
       

        System.out.println(targetsumTab(nums,dp,targetsum));
        System.out.println("Table:- ");
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(); 

        
       
    }
    
}
