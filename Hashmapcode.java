import java.util.*;

public class Hashmapcode {

    static class HashMap<K,V>{ // generic "<K,V>"

    private class Node{

        K key;
        V value;

        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }

    }

    private int n;  //n(number of nodes)
    private int N;
    private LinkedList<Node> buckets[];//N=buckets.lenght
    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
    }

    private int hashfunction(K key){
        int hc=hashCode();
        return Math.abs(hc)%buckets.length;
    }

    private int searchinLL(K key , int bi){
        LinkedList <Node> ll=buckets[bi];
        int di=0;
        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                return di;
            }
            di++;
        }

        return -1;
    }
  @SuppressWarnings("unchecked") 
    private void rehash(){
        LinkedList <Node> oldbuck[]=buckets;
      
        buckets=new LinkedList[N*2];
        N=N*2;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }

        for(int i=0;i<oldbuck.length;i++){
            LinkedList<Node> ll=oldbuck[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.remove();
                put(node.key, node.value);
            }
        }



    }
    

    public void put(K key,V value){
        int bi=hashfunction(key);
        int di=searchinLL(key,bi);  // valid or -1

        if(di!=-1){
            Node node=buckets[bi].get(di);
            node.value=value;
        }

        else{
            Node node=new Node(key, value);
            buckets[bi].add(node);
            n++;
        }
        double lambda =(double) n/N;
        if(lambda>2.0){
            rehash();
        }
       


    }

    public Boolean containsKey(K key){
        int bi=hashfunction(key);
        int di=searchinLL(key, bi);
        if(di!=-1){
            return true;
        }
        return false;
 
    }

    public V get(K Key){
        int bi=hashfunction(Key);
        int di=searchinLL(Key, bi);
        if(di==-1){
            return null;
        }

        else{
            return buckets[bi].get(di).value;

        }
    }

    public V remove(K key){
        int bi=hashfunction(key);
        int di=searchinLL(key, bi);
        if(di==-1){
            return null;
        }
        else{
             n--;
            return buckets[bi].remove(di).value;
           
                 
        }
    }

    public ArrayList<K> keyset(){
        ArrayList <K> keys=new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
           LinkedList <Node> ll=buckets[i];

           for (Node node : ll) {
            keys.add(node.key);
           }
        }
        return keys;

    }
    public Boolean isempty(){
        return n==0;
    }





}
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 100);
        map.put("US", 50);
        map.put("China", 150);
        map.put("Nepal", 20);
    //     System.out.println(map.remove("China"));

    //    ArrayList<String> keys =map.keyset();
    //    for (String k : keys) {
    //     System.out.println(k);
        
    //    }
   

    }
    
}
