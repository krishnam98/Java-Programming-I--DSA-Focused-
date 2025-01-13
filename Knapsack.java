import java.util.*;



public class Knapsack {

    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};
      double ratio[][]=new double [value.length][2];
      int capacity=50;
     int finalValue=0;
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;   //index

            ratio[i][1]=value[i]/(double)weight[i];

        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        for(int i=ratio.length-1;i>=0;i--){
            if(capacity>weight[(int)ratio[i][0]]){
                finalValue=finalValue+value[(int)ratio[i][0]];
                capacity=capacity-weight[(int)ratio[i][0]];

            }

            else{
                finalValue+=(ratio[i][1]*capacity);   //short hand does not require typecastin
                capacity=0;
                break;
            }
        }

        System.out.println("Final vale is:"+finalValue);



    }
    
}
