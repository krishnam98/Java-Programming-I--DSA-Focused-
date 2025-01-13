import java.util.*;

public class pathwithmineffort {
    static class Path implements Comparable<Path>{
        int data;
        int i;
        int j;

        public Path(int data,int i,int j){
            this.data=data;
            this.i=i;
            this.j=j;

        }

        public int compareTo(Path p2){
            return this.data-p2.data;
        }
    }

    public static int findcost(int arr[][]){
        PriorityQueue <Path> pq=new PriorityQueue<>();
        int m=arr.length;
        int n=arr[0].length;
        boolean visited[][]=new boolean[m][n]; 
        int sum=arr[0][0];
        int curri=0;
        int currj=0;
        visited[0][0]=true;

        while(curri!=m-1 || currj!=n-1){

            if(curri+1<m && !visited[curri+1][currj]){
                pq.add(new Path(arr[curri+1][currj], curri+1, currj));

            }

            if(currj+1<n && !visited[curri][currj+1]){
                pq.add(new Path(arr[curri][currj+1], curri, currj+1));
            }

             if(curri-1>=0 && !visited[curri-1][currj]){
                pq.add(new Path(arr[curri-1][currj], curri-1, currj));

            }

            if(currj-1>=0 && !visited[curri][currj-1]){
                pq.add(new Path(arr[curri][currj-1], curri, currj-1));
            }

            sum+=pq.peek().data;
            curri=pq.peek().i;
            currj=pq.peek().j;

            visited[pq.peek().i][pq.peek().j]=true;

            while(!pq.isEmpty()){
                pq.remove();
            }

        }
        return sum;


    }

    public static void main(String args[]){
        int arr[][]={{31,100,65,12,18},
                     {10,13,47,157,6},
                     {100,113,174,11,33},
                     {88,124,41,20,140},
                     {99,32,111,41,20}};
                     System.out.println(findcost(arr));

    }
    
}
