import java.util.*;


public class stackQ3 {
    public static String decode(String str){
        Stack <Character> s=new Stack<>();
        Stack <Integer> d=new Stack<>();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
 int count =0;
            if(Character.isDigit(str.charAt(i))){
               
                while(Character.isDigit(str.charAt(i))){
                    count=count*10+str.charAt(i)-'0';       //ascii value of '2'= 50, '0'=48
                    i++;
                }
                i--;
                d.push(count);
            }

            else if(str.charAt(i)=='['){
                if(!Character.isDigit(str.charAt(i-1))){
                    d.push(1);
                    s.push(str.charAt(i));
                }
                else{
                    s.push(str.charAt(i));
                }

            }

            else if(str.charAt(i)==']'){
                s1.setLength(0);
               int er=0;
                if(!d.empty()){
                       er=d.pop();
                    }
                while(!s.empty() && s.peek()!='['){
                   

                    s1.append(s.peek());
                    s.pop();


                }
                if(!s.empty() && s.peek()=='['){
                    s.pop();
                }
                for(int j=0;j<er;j++){
                    s2.append(s1);
                }
                s2.reverse();
                for(int j=0;j<s2.length();j++){
                    s.push(s2.charAt(j));
                }

                s2.setLength(0);

            }

            else{
                s.push(str.charAt(i));

            }

        }
        return s.toString();
    }

    public static void main(String args[]){
        String str="3[b2[ca]l]";
        System.out.println(decode(str));
    }
    
}
