public class maxprofitfromstocks {
    public static int buyandsellstocks(int prices[]){
        int BuyingPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(BuyingPrice<prices[i]){
                int profit=prices[i]-BuyingPrice;// Today's profit
                
                MaxProfit=Math.max(MaxProfit,profit); //maximum profit
            }
            else{BuyingPrice=prices[i];}
        }
        return MaxProfit;

    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
       System.out.print("maximum profit: " + buyandsellstocks(prices));
    }
}
