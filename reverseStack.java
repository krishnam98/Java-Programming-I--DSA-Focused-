import java.util.*;

public class reverseStack {
    public static void pushAtBottom(Stack <Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }

         int top=s.pop();
         pushAtBottom(s, data);
         s.push(top);
         return;
    }

    public static void reverseAstack(Stack <Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseAstack(s);
        pushAtBottom(s, top);
        return;

    }
    public static void main (String args[]){
        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        /* Stack input: 3
         *              2
                        1    */ 


        

        reverseAstack(s);

        while(!s.empty()){
            System.out.println(s.pop());
        }


    }
    
}
