import java.util.*;
public class graphQ3 {

 static class Pair{
    int i;
    int j;

    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
 }

 public static int timehelper(int arr[][]){
    Queue <Pair> q=new LinkedList<>();
    int count=0;

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           if(arr[i][j]==2){
            q.add(new Pair(i,j));
           } 
        }
        
    }
     q.add(null);

     while(!q.isEmpty()){
        Pair curr=q.remove();
        if(curr==null){
            count++;
            if(q.isEmpty()){
                return count;
            }
            else{
                q.add(null);
            }
            
        }
        else{
            int i= curr.i;
            int j=curr.j;
            //    up
            if((i-1)>=0 && arr[i-1][j]==1){
                arr[i-1][j]=2;
                q.add(new Pair(i-1, j));
            }
            //  left
            if((j-1)>=0 && arr[i][j-1]==1){
                arr[i][j-1]=2;
                q.add(new Pair(i,j-1));
            }
            //  down
            if((i+1)<arr.length && arr[i+1][j]==1){
                arr[i+1][j]=2;
                q.add(new Pair(i+1,j));
            }
            // right
            if((j+1)<arr[0].length && arr[i][j+1]==1){
                arr[i][j+1]=2;
                q.add(new Pair(i,j+1));
            }
        }
     }
     return -1;

 }

 public static int time(int arr[][]){
    int count =timehelper(arr);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==1){
                return -1;
            }
        }
    }

    return count-1;
 }


    public static void main(String args[]){
       int arr[][]={{2,1,0,2,1},
                    {0,0,1,2,1},
                    {1,0,0,2,1}};

                    System.out.println(time(arr));


    }
    
}
