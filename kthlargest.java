import java.util.*;

public class kthlargest {

    public static void main(String args[]){
        int stream[]={10,20,11,70,50,40,100,5};
        int n=stream.length;
        int k=3;
        int ans[]=new int[n];
        PriorityQueue <Integer> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            if(pq.size()<k){
                pq.add(stream[i]);
            }
            else{
                if(stream[i]>pq.peek()){
                    pq.remove();
                    pq.add(stream[i]);
                }
            }

            if(pq.size()<k){
                ans[i]=-1;
            }
            else{
                ans[i]=pq.peek();
            }
            
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    
}
