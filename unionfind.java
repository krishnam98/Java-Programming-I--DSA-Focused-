import java.util.*;

public class unionfind {
    static int v=10;
    static int parent[]=new int[v];
    static int rank[]=new int[v];

    public static void init(){
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
    }

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void creategraph(ArrayList <Edge> edge){
        edge.add(new Edge(1, 9));
        edge.add(new Edge(1, 5));
        edge.add(new Edge(9, 5));
        edge.add(new Edge(5, 2));
        edge.add(new Edge(2, 7));

    }

    public static int find(int x){
        if(x==parent[x]){
            return x;
        }
        parent[x]=find(parent[x]);
        return parent[x];
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
        else{
             parent[parA]=parB;
        }
    }

    public static boolean unionFind(ArrayList <Edge> edges){
        for(int i=0;i<edges.size();i++){
            Edge e=edges.get(i);

            int a=e.src;
            int b=e.dest;
            int parA=find(a);
            int parB=find(b);

            if(parA==parB){
                return true;
            }
            else{
                union(a,b);
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList <Edge> edges=new ArrayList<>();
        creategraph(edges);
        init();
       System.out.println( unionFind(edges));

    }
    
}
