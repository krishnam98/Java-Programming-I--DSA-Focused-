import java.util.*;

public class Queue4 {

    public static void reverseK(Queue <Integer> q,int k){
        Stack <Integer> s=new Stack<>();
        // add element in stack
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
// add element in Queue
        while(!s.empty()){
            q.add(s.pop());
        }
// add the remaining elements i.e. q.size-k elements in queue
        for(int i=0;i<q.size()-k;i++){
           q.add( q.remove());
        }

    }
    public static void main(String args[]){
        Queue <Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverseK(q, 5);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }

        System.out.println();



    }
    
}
