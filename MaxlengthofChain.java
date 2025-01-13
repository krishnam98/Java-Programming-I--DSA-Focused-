import java.util.*;

public class MaxlengthofChain {

    public static void chainofPairs(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int lastend=pairs[0][1];  //selecting first pair
        int ans=1;

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastend){
                lastend=pairs[i][1];  //selecting pair
                ans++;
            }
        }

        System.out.println("Maximum length of chain of pairs= "+ans);
    }

    public static void main(String args[]){
     int pairs[][]={{5,24},
                    {39,60},
                    {5,28},
                    {27,40},
                    {50,90}};

                    chainofPairs(pairs);

    
}
}
