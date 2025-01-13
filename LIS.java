import java.util.*;

public class LIS {

    public static void lcs(int arr1[],int n,int arr2[],int m){
        int dp[][]=new int [n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr1[i-1]==arr2[j-1]){
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
    public static void lis(int arr[]){
        int n=arr.length;
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        int arr2[]=new int[n];
        int i=0;

        for(int item : set){
            arr2[i]=item;
            i++;
        }

        Arrays.sort(arr2);

        lcs(arr,n,arr2,n);

    }
    public static void main(String args[]){
        int arr[]={50,3,10,7,40,80};
        lis(arr);


    }
    
}
