import java.util.*;

public class halvesumarr{
    

    public static int halfsum(double arr[]){
        Comparator <Double> comparator=new Comparator<Double>() {
            @Override
            public int compare(Double a,Double b){
                return -Double.compare(a, b);
            }
            
        };

        PriorityQueue <Double> pq=new PriorityQueue<>(comparator);
        double sum=0;
        int opr=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            sum+=arr[i];
        }
        double newsum=sum;
        while(!(newsum<=(sum/2) && !pq.isEmpty())){
            Double curr=pq.remove();
            pq.add(curr/2);
            newsum-=(curr/2);   //important
            opr++;

            

        }
        return opr;
       


    }
    public static void main(String args[]){
        double arr[]={3,8,20};
        System.out.println(halfsum(arr));


    }
}