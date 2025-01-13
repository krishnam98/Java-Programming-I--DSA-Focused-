import java.util.*;

public class stackUsingDeque {

    static class Stack{
       static Deque <Integer> Q=new LinkedList<>();

        public static Boolean isEmpty(){
            return Q.isEmpty();
        }

        public static void push(int data){
            Q.addLast(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
           
            return Q.removeLast();
        }

        public static int peek(){
              if(isEmpty()){
                 System.out.println("stack is empty");
                 return -1;
                } 
                return Q.getLast();
            
        }

    }

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();

    }
    
}
