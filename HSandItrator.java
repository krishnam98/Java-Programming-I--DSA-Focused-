import java.util.*;
public class HSandItrator {
    public static void main(String args[]){
        HashSet <String> cities=new HashSet<>();
        cities.add("Jabalpur");
        cities.add("mumbai");
        cities.add("gurgaon");
        cities.add("Bhopal");


        System.out.println(cities);
        
        // Iterator it=cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for (String city : cities) {
        //     System.out.println(city);
            
        // }

        LinkedHashSet <String> lhs =new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Gurgaon");
        lhs.add("Bhopal");

        System.out.println(lhs);

        TreeSet <String> ts =new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Gurgaon");
        ts.add("Bhopal");

        System.out.println(ts);





    }
    
}
