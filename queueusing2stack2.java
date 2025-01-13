import java.util.Stack;

public class queueusing2stack2 {
    static class Queue{
        static Stack <Integer> s1=new Stack<>();
        static Stack <Integer> s2=new Stack<>();

        public static boolean isempty(){
            return s1.empty();
        }
// add function   tc=> O(1)
        public static void add(int data){
            s1.push(data);
        }
// remove function  => O(n)
        public static int remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;

            }

            while(!s1.empty()){
                s2.push(s1.pop());

            }
            int front=s2.pop();
            while(!s2.empty()){
                s1.push(s2.pop());
            }

            return front;

        }
// peek function  => O(n)
        public static int peek(){
             if(isempty()){
                System.out.println("queue is empty");
                return -1;

            }
            while(!s1.empty()){
                s2.push(s1.pop());

            }
            int front=s2.peek();
            while(!s2.empty()){
                s1.push(s2.pop());
            }

            return front;
            
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
