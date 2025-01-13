// finding largest subarr whose sum is 0

import java.util.*;
public class largeSAusingHM {
    public static int FindLength(int arr[]){  // O (n)
        int sum=0;
        int length=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            if(!map.containsKey(sum)){
                map.put(sum,j);
            }
            else{
               int length2=j-map.get(sum);
               length=Math.max(length, length2);
            }
        }

        return length;

    }


    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10};
        System.out.println(FindLength(arr));

    }
    
}
