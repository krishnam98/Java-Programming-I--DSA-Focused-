import java.util.*;

public class greedyQ4 {

    public static int MaxProfit(int prices[]){
        int bp=prices[0];
        int maxprofit=0;
        int curprofit=0;

        for(int i=1;i<prices.length;i++){
            int currp=prices[i];
            if(bp>currp){
                bp=currp;
            }
            else{
                curprofit=currp-bp;
                maxprofit=Math.max(maxprofit, curprofit);
            }
        }

        return maxprofit;

    }
    public static void main(String args[]){
        int prices[]={7,1,5,6,4,3};
        System.out.println(MaxProfit(prices));


    }
}
