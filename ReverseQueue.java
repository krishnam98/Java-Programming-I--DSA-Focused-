import java.util.*;


public class ReverseQueue {

    public static void ReverseQ(Queue <Integer> Q){
        Stack <Integer> s=new Stack<>();
        // transfering elements in Stack
        while(!Q.isEmpty()){
            s.push(Q.remove());
        }
       
        // placing again in Queue 
        while(!s.empty()){
            Q.add(s.pop());
        }
    }

    public static void main(String args[]){
         Queue <Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        ReverseQ(Q);

        while(!Q.isEmpty()){
            System.out.print(Q.remove()+" ");
        }
        System.out.println();

    }
    
}
