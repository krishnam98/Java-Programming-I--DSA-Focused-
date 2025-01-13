import java.util.*;

public class duplicateparentheses {

    public static Boolean isduplicate(String str){
        Stack <Character> s=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char curr=str.charAt(i);

            if(curr!=')'){
                s.push(curr);
            }
            

            else{
                int count =0;
                while(!s.empty() && s.peek()!='('){
                    s.pop();
                    count++;
                }

                if(s.peek()=='(' && count<1){
                   
                    return true;


                }
                else{s.pop();}

            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="(((a+b)+c))";  // always valid parentheses
        System.out.println(isduplicate(str));


    }
    
}
