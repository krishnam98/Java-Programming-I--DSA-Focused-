import java.util.*;

public class connectCities {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }

    public static void createGraph(int arr[][],ArrayList <Edge> graph[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int src=i;
                int dest=j;
                int wt=arr[i][j];
                if(wt!=0){
                   graph[src].add(new Edge(src, dest, wt));
                }
                
            }
        }
    }


    public static int connectCities(int cities[][],int src){
        @SuppressWarnings("unchecked")
        ArrayList <Edge> graph[]=new ArrayList[5];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        createGraph(cities, graph);

        PriorityQueue <Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[graph.length];
        int finalcost=0;
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                finalcost+=curr.cost;
                vis[curr.v]=true;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
        }

        return finalcost;

    }
    public static void main(String args[]){
        int cities[][]={{0,1,2,3,4},
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}};
                        System.out.println(connectCities(cities, 0));


    }

    
}
