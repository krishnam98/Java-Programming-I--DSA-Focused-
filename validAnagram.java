import java.util.*;

public class validAnagram {

    public static Boolean isValidAnagram(String s,String t){
        HashMap <Character,Integer> mapS=new HashMap<>();
        HashMap <Character,Integer> mapT=new HashMap<>();


        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
             mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);

        }
        for(int i=0;i<t.length();i++){
            if(mapS.containsKey(t.charAt(i))){
                if(mapS.get(t.charAt(i))!=mapT.get(t.charAt(i))){
                    return false;
                }
            }
            else{
                return false;
            }
           
        }

        return true;
         

    }

    public static void main(String args[]){
        String s="race";
        String t="care";
        System.out.println(isValidAnagram(s, t));

    }
    
}
