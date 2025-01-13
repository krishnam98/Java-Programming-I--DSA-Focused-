import java.util.*;
public class romantoint {
    public static int value(char ch){
        if(ch=='I'){
            return 1;
        }

        if(ch=='V'){
            return 5;
        }
        if(ch=='X'){ 
            return 10;
        }
        if(ch=='L'){
            return 50;
        }
        if(ch=='C'){
            return 100;
        }
        if(ch=='D'){
            return 500;
        }
        if(ch=='M'){
            return 1000;
        }
        return -1;

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter roman numerals: ");
        String str=sc.next();
        int temp=0;
        int i=0;
        while(i<str.length()){
            int s1=value(str.charAt(i));
            
            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                if(s2>s1){
                    temp-=s1;
                }

                else{
                    temp+=s1;
                }
            }

            else{
                temp+=s1;
            }

            i++;


        }
        
       

        System.out.print(temp);


    }
    
}
