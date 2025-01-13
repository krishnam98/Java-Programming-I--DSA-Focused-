import java.util.*;

public class hashmaps {
 
    public static void main(String args[]){
        HashMap <String,Integer> hm=new HashMap<>();

        //  Insert  TIME COMPLEXITY=> O(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        // System.out.println(hm);

        //   get  TIME COMPLEXITY=> O(1)

         //    int population=hm.get("India");
        //    System.out.println(population);
       //     System.out.println(hm.get("Bhutan"));


    //    Contains  TIME COMPLEXITY=> O(1)
    //   System.out.println(hm.containsKey("India"));


    // Remove TIME COMPLEXITY=> O(1)
    // System.out.println(hm.remove("US"));
    // System.out.println(hm);
    // System.out.println(hm.size());
    //    hm.clear();
    // System.out.println(hm.isEmpty());

    Set <String> keys=hm.keySet();

    for (String k : keys) {
        System.out.println("Key= "+k+" ,value= "+hm.get(k));
        
    }







    }
    
}
