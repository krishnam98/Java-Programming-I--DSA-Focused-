import java.util.*;

public class kruskals {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt-e2.wt;
        }
    }

    public static void creategraph(ArrayList <Edge> graph){
        //we have'nt taken adjacency list we stored edges in arraylist
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));

    }
    static int n=4;
    static int par[]=new int[n];
    static int rank[]=new int [n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;

        }
    }
    public static int find(int x){
        if(par[x]==x){
            return x;
        }
        par[x]=find(par[x]);
        return par[x];
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parA]=parB;
            rank[parB]++;
        }

        if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }

        else{
             par[parA]=parB;
        }
    }
    public static int kruskalMST(ArrayList <Edge> graph){
        init();
        Collections.sort(graph);
        int count=0;  //for counting edges that are been used
        
        int MSTcost=0;

        for(int i=0;count<n-1;i++){
        Edge e=graph.get(i);
        int parA=find(e.src);
        int parB=find(e.dest);
        if(parA!=parB){
            MSTcost+=e.wt;
            count++;
            union(e.src, e.dest);
        }

        }

        return MSTcost;



    }
    
    public static void main(String args[]){
        ArrayList <Edge> graph=new ArrayList<>();
        creategraph(graph);
        System.out.println(kruskalMST(graph));


           
    }
    
}
