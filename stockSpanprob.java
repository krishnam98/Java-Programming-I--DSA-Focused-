import java.util.*;

public class stockSpanprob {
    public static void stockSpan(int stock[]){
        Stack<Integer> s=new Stack<>();
        int span[]=new int[stock.length ];
        span[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            int curr=stock[i];

            while(!s.empty() && curr>=stock[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                span[i]=i+1;

            }

            else{
                span[i]=i-s.peek();
            }

            s.push(i);
        }

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
    public static void main(String args[]){
        int stock[]={100,80,60,70,60,85,100};
         stockSpan(stock);
        

        

    }
    
    
}
