import java.util.*;

public class Queue2{

    public static int connectRopes(int arr[]){
        Arrays.sort(arr);
        Queue <Integer> Q=new LinkedList<>();
        Q.add(arr[0]+arr[1]);
        int cost=Q.peek();

        for(int i=2;i<arr.length;i++){
            Q.add(Q.remove()+arr[i]);
            cost=cost+Q.peek();
        }
        return cost;
        
    }
    public static void main(String args[]){
        int arr[]={1,3,2};
        System.out.println(connectRopes(arr));
    }
}