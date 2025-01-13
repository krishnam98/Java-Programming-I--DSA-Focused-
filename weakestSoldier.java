import java.util.*;

public class weakestSoldier {

    static class Row implements Comparable<Row>{
        int soldiers;
        int index;

        public Row(int soldiers,int index){
            this.soldiers=soldiers;
            this.index=index;
        }

        public int compareTo(Row r1){
            if(this.soldiers==r1.soldiers){
                return this.index-r1.index;
            }

            else{
                return this.soldiers-r1.soldiers;
            }
        }
    }

    public static void main(String args[]){
        int arr[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
                     int k=2;

                     PriorityQueue <Row> pq=new PriorityQueue<>();

                     for(int i=0;i<arr.length;i++){
                        int count=0;
                        for(int j=0;j<arr.length;j++){
                            if(arr[i][j]==1){
                                count++;
                            }

                        }
                        pq.add(new Row(count, i));

                     }

                     for(int i=0;i<k;i++){
                        System.out.println("R"+pq.remove().index);

                     }
        
        

    }
    
}
