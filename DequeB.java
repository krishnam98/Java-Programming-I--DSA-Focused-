import java.util.*;

public class DequeB {
    public static void main(String args[]){
        Deque <Integer> Q=new LinkedList<>();
        Q.addFirst(1);
        Q.addFirst(2);
        System.out.println(Q);//2,1
        Q.removeFirst();
        System.out.println(Q); //1
        Q.addLast(3);
        System.out.println(Q); //1,3
        
        
        System.out.println("first element= " +Q.getFirst());



    }
    
}
