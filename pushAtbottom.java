import java.util.*;
public class pushAtbottom {
    public static void pushBottomf(Stack<Integer>s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottomf(s, data);
        s.push(top);
        return;

    }

    public static void main (String args[]){
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottomf(s, 4);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }

    
    
}
