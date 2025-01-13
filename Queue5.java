import java.util.*;


public class Queue5 {

    public static void maxofSubarr(int arr[],int k){
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<=arr.length-k;i++){
            int max= Integer.MIN_VALUE;
            
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            q.add(max);
        }

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,4,5,2,3,6};
        int n=9;int k=3;
        maxofSubarr(arr, k);

    }
}
