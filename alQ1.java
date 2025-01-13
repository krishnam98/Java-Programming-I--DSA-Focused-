// Monotonic ArrayList
import java.util.ArrayList;

public class alQ1 {
    public static boolean ismonotonic(ArrayList<Integer> list){
        int count1=0;
        int count2=0;
        int n=list.size();
        for(int i=0;i<n-1;i++){
            if(list.get(i)<=list.get(i+1)){
                count1++;
            }

            if(list.get(i)>=list.get(i+1)){    //else if use nhi karenge
                count2++;
            }
        }

        if(count1==(n-1) || count2==(n-1)){
            return true;
        }

        else{return false;}

    }

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.print(ismonotonic(list));
    }

    
}
