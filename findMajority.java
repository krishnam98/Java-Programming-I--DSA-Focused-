import java.util.*;

public class findMajority{
    public static void Majorityelements(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }

            else{
                map.put(nums[i], 1);
            }
        }
        
        Set <Integer> keys=map.keySet();
        for (Integer key : keys) {
            if(map.get(key)>(nums.length/3)){
                System.out.print(key+" ");
            }
            
        }
    }
    public static void main(String args[]){
        int nums[]={1,2};
        Majorityelements(nums);


    }
}