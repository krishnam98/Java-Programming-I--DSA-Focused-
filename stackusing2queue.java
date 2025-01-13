import java.util.*;
public class stackusing2queue{
    static class Stack{
        static Queue <Integer> Q1=new LinkedList<>();
        static Queue <Integer> Q2=new LinkedList<>();

        public static boolean isempty(){
          return Q1.isEmpty() && Q2.isEmpty();

        }
// O(1)
        public static void push(int data){
            if(!Q1.isEmpty()){
                Q1.add(data);
            }
            else{
                Q1.add(data);
            }
        }
// O(n)
        public static int pop(){
            if(!Q1.isEmpty()){
                int top=-1;
                while(!Q1.isEmpty()){
                    top=Q1.remove();
                    if(Q1.isEmpty()){
                        break;
                    }
                    Q2.add(top);
                }
                return top;
            } else{
                 int top=-1;
                while(!Q2.isEmpty()){
                    top=Q2.remove();
                    if(Q2.isEmpty()){
                        break;
                    }
                    Q1.add(top);
                }
                return top;

            }

            
        }
// O(n)
        public static int peek(){
            if(!Q1.isEmpty()){
                int top=-1;
                while(!Q1.isEmpty()){
                    top=Q1.remove();
                  
                    Q2.add(top);
                }
                return top;
            } else{
                 int top=-1;
                while(!Q2.isEmpty()){
                    top=Q2.remove();
                   
                    Q1.add(top);
                }
                return top;

            }


        }


    }

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isempty()){
            System.out.println(s.pop());
        }
    }
}