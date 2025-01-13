import java.util.*;

public class graph2Q3 {
    static class Pair{
        int first;
        int second;

        public Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }

    public static void creategraph(ArrayList<Pair> graph[],int pre[][]){
        for(int i=0;i<pre.length;i++){
           
            int src=pre[i][0];
            int dest=pre[i][1];
            graph[src].add(new Pair(src, dest));
        }

    }

    public static boolean detectcycle(ArrayList<Pair> graph[],boolean vis[], boolean stack[],int curr){
        stack[curr]=true;
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Pair p=graph[curr].get(i);
            if(stack[p.second]){
                return true;
            }

            else if(!vis[p.second] && detectcycle(graph, vis, stack, p.second)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static boolean findtask(ArrayList<Pair> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<vis.length;i++){
            if(!vis[i] && detectcycle(graph,vis,stack,i)){
                return false;
            }
        }
        return true;
    }

    
    public static void main(String args[]){
        int pre[][]={{1,0},{0,1}};
        int n=2;
        @SuppressWarnings("unchecked")
        ArrayList <Pair> graph[]=new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        creategraph(graph, pre);
        System.out.println(findtask(graph));


        

        
    }
    
}
