import java.util.ArrayList;
public class pairsumal {

// 2 POINTER APPROACH, TIME COMPLEXITY=>O(n)
    public static void pairsumF(ArrayList<Integer> list,int target){
        int lp=0;    //left pointer
        int rp=list.size()-1;     //right pointer
        while(lp<rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                System.out.print(list.get(lp)+","+list.get(rp));
                return;
            }
            if(sum>target){
                rp--;
            }
            else{lp++;}

        }

        System.out.print("pair not found!");
    }


// BRUTE FORCE, TIME COMPLEXITY=> O(n^2)
     public static void pairsum1(ArrayList<Integer> list,int target){

// BRUTE FORCE, TIME COMPLEXITY=> O(n^2)

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int sum=list.get(i)+list.get(j);

                if(sum==target){
                    System.out.print(list.get(i)+","+list.get(j));
                    return;
                }
            }
        }

        System.out.print("pair not found!");
    }

    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target=5;

        // BRUTE FORCE, TIME COMPLEXITY=> O(n^2)
        // pairsum1(list, target);

// 2 POINTER APPROACH, TIME COMPLEXITY=>O(n)
        pairsumF(list,target);
        
    }
    
}
