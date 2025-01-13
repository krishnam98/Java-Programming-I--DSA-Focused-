import java.util.*;

public class Indiancoin {
    public static void main(String args[]){
        Integer coin[]={1,2,5,10,20,50,100,500,2000};
        int amount=590;
        int countcoin=0;

        ArrayList <Integer> ans=new ArrayList<>();


        Arrays.sort(coin,Comparator.reverseOrder());

        for(int i=0;i<coin.length;i++){
            if(coin[i]<=amount){
               while(coin[i]<=amount){
                 ans.add(coin[i]);
                 amount-=coin[i];
                 countcoin++;
                }

            }

        }

        System.out.println("Number of (minimum) coins used= "+countcoin);

        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i)+" ");
        // }

        System.out.println(ans);

        


    }
    
}
