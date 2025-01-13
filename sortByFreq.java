import java.util.*;

public class sortByFreq {

    static class Pair implements Comparable<Pair>{
        char c;
        int freq;
        public Pair(char c,int freq){
            this.c=c;
            this.freq=freq;

        }
        @Override
        public int compareTo(Pair p2){
            return p2.freq-this.freq;
        }
    }

    public static String SortByFrequency(String s){
        HashMap <Character,Integer> map=new HashMap<>();
        PriorityQueue <Pair> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        Set <Character> keys=map.keySet();

        for (char c : keys) {
            pq.add(new Pair(c, map.get(c))); 
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            for(int i=0;i<curr.freq;i++){
                sb.append(curr.c);

            }
        }

        return sb.toString();

    }
    public static void main(String args[]){
        String s="tree";
        System.out.println(SortByFrequency(s));
    }
    
}
