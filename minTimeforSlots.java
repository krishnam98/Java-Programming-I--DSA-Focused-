import java.util.*;

public class minTimeforSlots {
    public static int mintime(int arr[],int n,int k){
        Queue <Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[n+1];
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }

        int time=0;

        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            visited[arr[i]]=true;
        }
        while(q.size()>0){
            for(int i=0;i<q.size();i++){
                int curr=q.poll();
            if((curr-1>=1) && !visited[curr-1]){
                visited[curr-1]=true;
                q.add(curr-1);
            }

             if((curr+1<=n) && !visited[curr+1]){
                visited[curr+1]=true;
                q.add(curr+1);
            }
           }

            time++;
        }

        return time-1;
    }
    
    public static void main(String args[]){
        int arr[]={2,6};
        System.out.println(mintime(arr, 6, 2));
        
       
    }
    
}
