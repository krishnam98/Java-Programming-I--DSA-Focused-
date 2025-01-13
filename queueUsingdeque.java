import java.util.*;

public class queueUsingdeque {
    static class Queue{
        static Deque <Integer> Q=new LinkedList<>(); 

        public static Boolean isEmpty(){
            return Q.isEmpty();
        }

        public static void add(int data){
            Q.addLast(data);
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return Q.removeFirst();
        }

        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return Q.getFirst();

        }
    }

    public static void main(String args[]){
        Queue Q=new Queue();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        while(!Q.isEmpty()){
            System.out.print(Q.peek()+" ");
            Q.remove();
        } 

    }
    
}
