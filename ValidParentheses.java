import java.util.*;


public class ValidParentheses {
    public static Boolean ValidparenthesesF(String str){
        Stack <Character> s=new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            // pushing opening brackets
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ){
                s.push(str.charAt(i));

            }
            // agar opening brackets daale bina sirf closing bracket check karenge to invalid hi hoga
            if(s.empty()){
                return false;
            }
            // checking that closing bracket pairs with closing bracket 

            if(str.charAt(i)=='}'){
                if(s.peek()=='{'){
                    s.pop();

                }
                else{ return false;}
            }

             if(str.charAt(i)==']'){
                if(s.peek()=='['){
                    s.pop();

                }
                else{ return false;}
            }

             if(str.charAt(i)==')'){
                if(s.peek()=='('){
                    s.pop();

                }
                else{ return false;}
            }

          
        }
        if(s.empty()){
                return true;
              }

           else{
            return false;
           }
    }
    public static void main(String args[]){
        String str="{}()[]";
        System.out.println (ValidparenthesesF(str));

    }
    
}
