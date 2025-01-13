import java.util.*;
public class revstrwithStack { 
    public static String reversestr(String str){
        Stack <Character> s=new Stack<>();
        int i=0;
        // filling stack with characters of string 
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.empty()){
           char curr= s.pop();
           sb.append(curr);

        }
        return sb.toString();

    }

    public static void main(String args[]){
        String str="abc";
        System.out.println(reversestr(str));
    }

    
}
