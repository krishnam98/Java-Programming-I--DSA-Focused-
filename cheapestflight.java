import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class cheapestflight {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;

        }
    }

     static class Info{
        int v;
        int cost;
        int stop;

        public Info(int v,int c,int k){
            this.v=v;
            this.cost=c;
            this.stop=k;
        }

        
     }

    public static void createGraph(ArrayList<Edge> graph[],int arr[][]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int src=arr[i][0];
            int dest=arr[i][1];
            int wt=arr[i][2];

            Edge e=new Edge(src, dest, wt);
            graph[src].add(e);

        }
    }

    public static int cheapestFlight(int flights[][],int src,int dest,int k){
        @SuppressWarnings("unchecked")
        ArrayList <Edge> graph[]=new ArrayList[4];
        createGraph(graph, flights);
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue <Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));
        int finalcost=0;

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stop>k){
                break;
            }
            finalcost+=curr.cost;

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(curr.cost+wt<dist[v] && curr.stop<=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stop+1));
                }
            }
        }
            if(dist[dest]==Integer.MAX_VALUE){
                return -1;
            }
            else{
                  return dist[dest];
            }
        

        
    }



    public static void main(String args[]){
        int flights[][]={{0,1,100},{1,2,100},{1,3,600},{2,3,200},{2,0,100}};
                      int src=0;
                      int dest=3;
                      int k=1;

                      System.out.println(cheapestFlight(flights, src, dest, k));

    }

    
    
}
