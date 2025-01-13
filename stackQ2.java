import java.util.*;

public class stackQ2 {

    public static String Simplify(String str){
        Stack <Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='.' && str.charAt(i-1)=='.'){
                while(!s.empty()){
                    s.pop();
                }

                s.push('/');
            }

            else if(ch=='.'){
                continue;
            }

            else{
                s.push(ch);
            }

        }

if(s.peek()=='/' ){
    s.pop();
}
        Stack <Character> s2=new Stack<>();
        while(!s.empty()){
            if(s.peek()!='/'){
                s2.push(s.pop());

            }

            else{
                int count=0;
                s2.push(s.pop());
                
                while(!s.empty() && s.peek()!='/'){
                    s2.push(s.pop());
                    count++;
                }
                if(count<1){
                    while(!s.empty() && s.peek()=='/'){
                        s.pop();
                    }
                }
            }



        }

        String res="";
        while(!s2.empty()){
        res=res+s2.pop();
        }
        if(res==""){
            res=res+'/';
        }
        return res;

    //     String res=s2.toString();
    //     String res2="";
    //     if(res.charAt(0)=='/'){
    //         for(int i=res.length()-1;i>=1;i--){
    //             res2+=res.charAt(i);
    //         }
    //     }

    //     else{
    //         for(int i=res.length()-1;i>01;i--){
    //             res2+=res.charAt(i);
    //         }
    //     }

        
    //    return res2;
       
    


    }
    public static void main(String args[]){
        String str="/../c/b/a/c/";
     System.out.println(Simplify(str));


    }
}
