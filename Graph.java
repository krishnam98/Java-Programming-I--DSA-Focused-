import java.util.*;


public class Graph {
    static class Edge{
        int src;
        int dest;
        int weight;
        

        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
         boolean visited[]=new boolean[graph.length];
         for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                bfsutil(graph, visited);
            }
         }

    }

    public static void bfsutil(ArrayList<Edge> graph[],boolean visited[]){  //TC=> O(v+E)
        Queue <Integer> q=new LinkedList<>();
       
        q.add(0);  //starting point

        while(!q.isEmpty()){
            int curr=q.remove();
            
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                dfsutil(graph, i, vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph, e.dest, vis);
            }
        }
    }

    public static boolean haspath(int src,int dest,ArrayList<Edge> graph[],int sp,boolean vis[]){
        vis[src]=true;
        if(src==dest){
            return true;
        }

       

        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && haspath(e.dest, dest, graph, sp,vis)){
                 return true;
            }
           
        }
         
        return false;
    }
    public static boolean detectcycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
               return detectcycleutil(graph,i,-1,vis);
            }
        }
        return false;
    }

    public static boolean detectcycleutil(ArrayList<Edge> graph[],int curr,int par,boolean vis[]){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                if(detectcycleutil(graph, e.dest, curr, vis)){
                    return true;
                }
            }

            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
        }

        return false;

    }
    public static boolean bipartite(ArrayList<Edge> graph[]){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
         Queue <Integer> q=new LinkedList<>();
           for(int i=0;i<col.length;i++){

         if(col[i]==-1){
                q.add(i);
                col[i]=0;

                while(!q.isEmpty()){
                int curr=q.remove();
                for(int j=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(j);
                if(col[e.dest]==-1){ //unvisited
                    if(col[curr]==0){
                        col[e.dest]=1;
                    }
                    else{
                        col[e.dest]=0;
                    }
                    q.add(e.dest);
                }

                else if(col[e.dest]!=-1){ //visited
                    if(col[curr]==col[e.dest]){
                        return false;
                    }
                }
            }
        }
         


              
            }
        } 
        return true;

        
    }
// directed graph
    public static boolean detectcycle2(ArrayList <Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                 return detectcycleutil2(graph,vis,stack,i);
            }
        }
        return false;
    }

    public static boolean detectcycleutil2(ArrayList <Edge> graph[],boolean vis[],boolean stack[],int curr){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }

           else if(!vis[e.dest] && detectcycleutil2(graph, vis, stack, e.dest)){
                return true;
            }
        }
        stack[curr]=false;
        return false;

    }

    public static void toposort(ArrayList <Edge> graph[]){
        boolean vis[]=new boolean [graph.length];
        Stack <Integer> s=new Stack<>();
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                toposortutil(graph,vis,s,i);
            }
        }

        while(!s.empty()){
            System.out.print(s.pop()+" ");
        }

    }

    public static void toposortutil(ArrayList <Edge> graph[],boolean vis[],Stack <Integer> s,int curr){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                toposortutil(graph,vis,s,e.dest);
            }
        }
        s.add(curr);
    }

    public static void calcIndegree(ArrayList <Edge> graph[], int indeg[]){
           for(int i=0;i<graph.length;i++){
              for(int j=0;j<graph[i].size();j++){
                 Edge e=graph[i].get(j);
                 indeg[e.dest]++;
                }
           }
    }

    public static void toposort2(ArrayList <Edge> graph[]){
        int indeg[]=new int[graph.length];
        Queue <Integer> q=new LinkedList<>();

        calcIndegree(graph, indeg);
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                 q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }

    public static void allpath(ArrayList <Edge> graph[],int src,int tar,String path){
        
        if(src==tar){
          System.out.println(path+tar);
          return;
          
        }
        else{
            for(int i=0;i<graph[src].size();i++){
                Edge e=graph[src].get(i);
                allpath(graph, e.dest, tar, path+src);
            }
        }
            
    }

    static class Pair implements Comparable <Pair>{
        int v;
        int path;

        public Pair(int v,int path){
            this.v=v;
            this.path=path;

        }

        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }

    public static void dijkstra(ArrayList <Edge> graph[],int src){
        int dist[]=new int [graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }


        PriorityQueue <Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[graph.length];
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
          if(!vis[curr.v]){
               vis[curr.v]=true;
               for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                if((dist[curr.v]+e.weight)<dist[e.dest]){   //dist[u]+weight(u,v)<dist[v]
                    dist[e.dest]=dist[curr.v]+e.weight;
                    pq.add(new Pair(e.dest,dist[e.dest]));
                }
              }
           }

        }

    //    printing shortest paths
        for (int i : dist) {
            System.out.print(i+" ");
        }
        System.out.println();




    }

    public static void bellmanFord(ArrayList <Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            dist[i]=Integer.MAX_VALUE;
        }

        dist[src]=0;
        int V=graph.length;

        // OVERALL TIME COMPLEXITY=>O(V*E)
        // tc=>O(V-1)
        for(int i=0;i<V-1;i++){
            //taking out edges
            //tc=>O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;  //or j same as curr vertex
                    int v=e.dest;
                    int wt=e.weight;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;

                    }
                }
            }
        }


        for (int i : dist) {
            System.out.print(i+" ");
            
        }
    }
    static class Pair2 implements Comparable <Pair2>{
        int v;
        int cost;

        public Pair2(int v,int c){
            this.v=v;
            this.cost=c;

        }
        @Override
        public int compareTo(Pair2 p2){
            return this.cost-p2.cost;
        }

    }

    public static void prims(ArrayList <Edge> graph[],int src){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue <Pair2> pq=new PriorityQueue<>();
        pq.add(new Pair2(src, 0));

        int finalcost=0;
        while(!pq.isEmpty()){
            Pair2 curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalcost+=curr.cost;
                // adding neighbours in pq with less weight fist
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair2(e.dest,e.weight));
                }

            }
        }

        System.out.println(finalcost);

    }

    public static boolean Ques1(ArrayList <Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                q.add(i);
            }

            while(!q.isEmpty()){
                int curr=q.remove();
                vis[curr]=true;

                for(int j=0;j<graph[curr].size();j++){
                    Edge e= graph[curr].get(j);
                    if(!vis[e.dest]){
                        if(q.contains(e.dest)){
                            return true;
                        }
                        else{
                            q.add(e.dest);
                        }
                    }
                }

                
            }
        }
        return false;

    }

    public static int motherV(ArrayList <Edge> graph[],int v){
        Queue <Integer> q=new LinkedList<>();
        HashSet <Integer> hs=new HashSet<>();
        

        for(int i=0;i<v;i++){
            int count=0;
            q.add(i);
            while(!q.isEmpty()){
                int curr=q.remove();
                if(!hs.contains(curr)){
                    hs.add(curr);
                    count++;
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        q.add(e.dest);
                    }

                }

            }
            hs.clear();
             if(count==v){
                return i;
             }

        }

        return -1;
    }

    public static void toposortKosa(ArrayList <Edge> graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                toposortKosa(graph,e.dest,vis,s);
            }
        }
        s.add(curr);
    }

    public static void dfsKosa(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
         System.out.print(curr+" "); 
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                
                 dfsKosa(graph,e.dest,vis);

            }

        }
    }

    

    public static void kosaraju(ArrayList<Edge> graph[]){
        Stack <Integer> s=new Stack<>();
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                toposortKosa(graph, i, vis, s);
            }
        }
          @SuppressWarnings("unchecked")
        ArrayList <Edge> transpose[]=new ArrayList[graph.length];
        for(int i=0;i<transpose.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();
        }

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src, i)); //reverse edge
            }
        }

        while(!s.empty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("SCC-> ");
                dfsKosa(transpose,curr,vis);
                 System.out.println();
            }
           
        }







    }
    public static void dfstarjan(ArrayList<Edge> graph[],int curr,int dt[],
                                  int low[],boolean vis[],int time,int par){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            int neigh=e.dest;
            if(neigh==par){
                continue;
            }

            else if(!vis[neigh]){
                dfstarjan(graph,neigh,dt,low,vis,time,curr);
                low[curr]=Math.min(low[curr],low[neigh]);
                if(dt[curr]<low[neigh]){
                    System.out.println("Bridge: "+curr+"----"+neigh);
                }

            }
            else{
                low[curr]=Math.min(low[curr],dt[neigh]);
            }

        }                            

                                  }

    public static void tarjanbridge(ArrayList <Edge> graph[],int v){
        int dt[]=new int [v];
        int low[]=new int [v];
        boolean vis[]=new boolean[v];
        int time=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfstarjan(graph,i,dt,low,vis,time,-1);
            }
        }

    }

    public static void apDfs(ArrayList <Edge> graph[],int curr,int dt[],int low[],boolean vis[],int time,int par){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        int children=0;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            int neigh=e.dest;
            if(neigh==par){
                continue;
            }
            else if(vis[neigh]){
                low[curr]=Math.min(low[curr],dt[neigh]);
            }

            else if(!vis[neigh]){
                apDfs(graph, neigh, dt, low, vis, time, curr);
                low[curr]=Math.min(low[curr],low[neigh]);
                if(par!=-1 && dt[curr]<=low[neigh]){
                    System.out.println("Articulation point: "+curr);
                }
                children++;

            }
        }

        if(par==-1 && children>1){
            System.out.println("Articulation point: "+curr);
        }
    }

    public static void tarjanAp(ArrayList <Edge> graph[],int v){
        int dt[]=new int[v];
        int low[]=new int[v];
        boolean vis[]=new boolean[v];
        int time=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                apDfs(graph,i,dt,low,vis,time,-1);
            }
        }
    }

   

     

    


    public static void main(String args[]){
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList <Edge> [] graph=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));


        // 1 vertex
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,40));
        // graph[1].add(new Edge(1,5,7));
       

        // 2 vertex
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,1,50));
        // graph[2].add(new Edge(2,4,1));
        

        // 3 vertex
        graph[3].add(new Edge(3,0,40));
        graph[3].add(new Edge(3,4,30));
        // graph[3].add(new Edge(3,5,50));
 
        // 4 vertex
        graph[4].add(new Edge(4,3,-1));
        // graph[4].add(new Edge(4,5,5));

        // 5 vertex
        // graph[5].add(new Edge(5,3,2));
        // gr aph[5].add(new Edge(5,4,5));

        // 9 vertex
        // graph[9].add(new Edge(9,1,2));
        // graph[9].add(new Edge(9,5,5));




    //    printing neighbours of 2 vertex 
    //    which destinations of edges whose src is 2
    // for(int i=0;i<graph[2].size();i++){
    //     Edge e=graph[2].get(i);
    //     System.out.print(e.dest+" ");
    // }

    // bfs(graph);
    // boolean vis[]=new boolean[v];
    // dfs(graph,0,vis);

    // System.out.println(haspath(0, 4, graph, 0,vis));
    // System.out.println(detectcycle2(graph));
    // toposort2(graph);
    
    // allpath(graph, 0, 2, "");
    // dijkstra(graph,0);
//    bellmanFord(graph, 0);
    //  prims(graph, 0);
    // System.out.println(motherV(graph, v));
    // kosaraju(graph);
    // tarjanbridge(graph, v);
    tarjanAp(graph, v);
     

 

    }

    
}
