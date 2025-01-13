import java.util.*;

public class nearbycars {

    static class Cars implements Comparable<Cars>{
        int x;
        int y;
        int no;
        int distsqr;

        public Cars(int x,int y,int no){
            this.x=x;
            this.y=y;
            this.no=no;
            this.distsqr=(int)Math.pow((x*x)+(y*y), 1/2);
        }

        public int compareTo(Cars c1){
            return this.distsqr-c1.distsqr;
        }
    }

    public static void main (String args[]){
        int cars[][]={{3,4},
                      {5,-1}, 
                      {-2,4}};
                      int k=2;
        PriorityQueue <Cars> pq=new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(new Cars(cars[i][0], cars[i][1],i));
        }  
        
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().no);
        }
                    


    }
    
}
