import java.util.*;

public class DisjoinSet {
    static int n=7;
    static int parent[]=new int[n];
    static int rank[]=new int[n];

    public static void initialize(){
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
    }

    public static int find(int x){
        if(x==parent[x]){
            return parent[x];
        }
       return find(parent[x]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            parent[parA]=parB;
            rank[parB]++;
        }

        else if(rank[parA]>rank[parB]){
            parent[parB]=parA;
        }

        else if(rank[parB]>rank[parA]){
            parent[parA]=parB;
        }
    }


    public static void main(String args[]){
        initialize();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        System.out.println(find(1));
        union(2, 3);
        System.out.println(find(2));

    }
    
}
