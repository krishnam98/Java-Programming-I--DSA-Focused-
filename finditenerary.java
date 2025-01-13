import java.util.*;

public class finditenerary {
    public static String findStart(HashMap <String,String> tickets){
        HashMap <String,String> revMap=new HashMap<>();
        for (String city : tickets.keySet()) {
            revMap.put(tickets.get(city), city);
            
        }

        for (String city : tickets.keySet()) {
            if(!revMap.containsKey(city)){
                return city;
            }
            
        }
        return null;
    }

    public static void printjourney(HashMap <String,String> tickets){
        String start=findStart(tickets);
        System.out.print(start);
        while(!tickets.isEmpty()){
            System.out.print(" -> "+tickets.get(start));
            start=tickets.remove(start);
        }
    }
    public static void main(String args[]){
        HashMap <String,String> tickets=new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
        printjourney(tickets);


        
    }
    
}
