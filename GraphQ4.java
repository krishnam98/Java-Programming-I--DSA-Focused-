import java.util.*;

public class GraphQ4 {

    static class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    public static int findregion(int arr[][]){
        int maxregion=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               if(arr[i][j]==1){
                int region =findregionhelper(arr,i,j);
                maxregion=Math.max(maxregion,region);
               }
            }
        }

        return maxregion;
    }

    public static int findregionhelper(int arr[][],int ci,int cj){
        Queue <Pair> q=new LinkedList<>();
        int region=1;
        q.add(new Pair(ci, cj));
        arr[ci][cj]=-1;

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int i=curr.i;
            int j=curr.j;

            if(i-1>=0 && j-1>=0 && arr[i-1][j-1]==1){  
                region++;
                q.add(new Pair(i-1, j-1));
                arr[i-1][j-1]=-1;
            }

             if(i-1>=0 && arr[i-1][j]==1){  
                region++;
                q.add(new Pair(i-1, j));
                arr[i-1][j]=-1;
            }

            if(i-1>=0 && j+1<arr[0].length &&  arr[i-1][j+1]==1){  
                region++;
                q.add(new Pair(i-1, j+1));
                arr[i-1][j+1]=-1;
            }

             if(j+1<arr[0].length &&  arr[i][j+1]==1){  
                region++;
                q.add(new Pair(i, j+1));
                arr[i][j+1]=-1;
            }

             if(i+1<arr.length && j+1<arr[0].length && arr[i+1][j+1]==1){  
                region++;
                q.add(new Pair(i+1, j+1));
                arr[i+1][j+1]=-1;
            }

            if(i+1<arr.length && arr[i+1][j]==1){  
                region++;
                q.add(new Pair(i+1, j));
                arr[i+1][j]=-1;
            }

            if(i+1<arr.length && j-1>=0 && arr[i+1][j-1]==1){  
                region++;
                q.add(new Pair(i+1, j-1));
                arr[i+1][j-1]=-1;
            }

            if( j-1>=0 && arr[i][j-1]==1){  
                region++;
                q.add(new Pair(i, j-1));
                arr[i][j-1]=-1;
            }

        }
        return region;


    }
    public static void main(String args[]){
        int arr[][]={{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,1,0,1,0,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,1,0,0,1,1,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

                     System.out.println(findregion(arr));



    }
}
