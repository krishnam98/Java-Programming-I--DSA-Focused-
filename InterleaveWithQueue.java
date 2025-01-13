import java.util.*;

public class InterleaveWithQueue {

    // public static int calSize(Queue<Integer> Q){
    //     int size=0;
    //     while(!Q.isEmpty()){
    //         Q.remove();
    //         size++;
    //     }
    //     return size;
    // }

    public static void Interleave(Queue <Integer> Q){
        int size=Q.size();
        Queue <Integer> Q2=new LinkedList<>();

        for(int i=0;i<size/2;i++){
            Q2.add(Q.remove());
        }
        while(!Q2.isEmpty()){
            Q.add(Q2.remove());
            Q.add(Q.remove());
        }

        while(!Q.isEmpty()){
            System.out.print(Q.remove()+" ");
        }
    }

    public static void main(String args[]){
        Queue <Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);
        Q.add(9);
        Q.add(10);

        Interleave(Q);
        
        
    }
    
}
