import java.util.*;

public class sliding_window {
    static class Pair implements Comparable<Pair>{
        int data;
        int idx;

        public Pair(int data,int idx){
            this.data=data;
            this.idx=idx;

        }

        public int compareTo(Pair P2){
            return P2.data-this.data;
        }
    }

    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        PriorityQueue <Pair> pq=new PriorityQueue<>();
        int ans[]=new int[arr.length-k+1];

        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        ans[0]=pq.peek().data;
      for(int i=k;i<arr.length;i++){
           while(pq.peek().idx<=(i-k)){
                 pq.remove();
            }
            pq.add(new Pair(arr[i], i));

            ans[i-k+1]=pq.peek().data;


        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println();
       


    }
    
}
