// pair sum for sorted & rotated ArrayList
import java.util.ArrayList;

public class pairsum2 {
    public static int Findpivot(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                return i;
            }
        }
         return 0;
    }
// TIME COMPLEXITY => O(n)
    public static void pairsum2(ArrayList<Integer> list,int target){
        int i=Findpivot(list);
        int lp=i+1;
        int rp=i;
        int n=list.size();
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
// case 1
            if(sum==target){
                System.out.print(list.get(lp)+","+list.get(rp));
                return;
            }
// case 2
            if(sum>target){
                rp=(n+rp-1)%n;
            }
// case 3
            if(sum<target){
                lp=(lp+1)%n;
            }
        }

        System.out.print("PAIR NOT FOUND!");
    }

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        pairsum2(list, 16);


    }
    
}
