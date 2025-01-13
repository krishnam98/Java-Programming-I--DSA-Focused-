import java.util.*;

public class greedyQ2 {
    public static void main(String args[]){
        int L=(-3);
        int R=3;
        int k=2;

        Integer arr[]=new Integer[R-L+1];
        
          int j=0;
        for(int i=L;i<=R;i++){
            arr[j]=i;
            j++;
        }

        Arrays.sort(arr,Comparator.reverseOrder());

        if(arr[k-1]%2==0){
            System.out.println(arr[(k-1)+1]);
        }
        else{
            System.out.println(arr[k-1]);
        }
    }
    
}
