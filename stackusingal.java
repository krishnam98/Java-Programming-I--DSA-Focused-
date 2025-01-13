import java.util.ArrayList;
public class stackusingal {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static Boolean isempty(){
            return list.size()==0;
            
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            int top=list.get(list.size()-1);
            return top;
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
