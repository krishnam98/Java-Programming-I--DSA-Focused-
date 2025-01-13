import java.util.*;
public class firstnonrepeating {
    public static String firstOccChar(String str){
        int freq[]=new int[26];
        Queue <Character> Q=new LinkedList<>();
        String answer="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            Q.add(ch);  // add the current character in queue

            freq[ch-'a']++;  // update the frequency of character

            while(!Q.isEmpty()){
                if(freq[Q.peek()-'a']==1){
                    answer+=Q.peek();
                    break;
                }

                else{
                    Q.remove();
                } 

            }
            if(Q.isEmpty()){
                answer+="-1";    //double quotes isiliye kyuki string ko add karenge
            }

        }
        return answer;
    }

    public static void main(String args[]){
        String str="aabccxb";
        System.out.println(firstOccChar(str));
    }

    
}
