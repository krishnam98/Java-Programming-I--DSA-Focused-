import java.util.*;

public class countDistinct {

    public static int countDistinctElements(int nums[]){
         HashSet<Integer> set =new HashSet<>();
         for (Integer i : nums) {
            set.add(i);  
              
         }

         return set.size();
    }

    public static void main(String args[]){
       int nums[]={4,3,2,5,6,7,3,4,2,1};
       System.out.println(countDistinctElements(nums));

        

    }
    
}
