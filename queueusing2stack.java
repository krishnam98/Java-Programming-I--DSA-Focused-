import java.util.*;

public class queueusing2stack{
    static class Queue{
      static Stack <Integer> s1=new Stack<>();
        
      static Stack <Integer> s2=new Stack<>();

      public static boolean isempty(){
        return s1.empty();
      }
// add function    tc=> O(n)
      public static void add(int data){
        while(!s1.empty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while(!s2.empty()){
         s1.push(s2.pop());
        }
      }
// remove function   tc=> O(1)
      public static int remove(){
        if(s1.empty()){
            System.out.println("queue is empty");
            return -1;
        }
        return s1.pop();
      }
// peek function    tc=> O(1)
      public static int peek(){
         if(s1.empty()){
            System.out.println("queue is empty");
            return -1;
        }
        return s1.peek();

      }

      


        
        

    }

public static void main(String args[]){
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isempty()){
        System.out.println(q.remove());
    }
}



}