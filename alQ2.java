import java.util.ArrayList;

public class alQ2 {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
       
         ArrayList <Integer> ans= new ArrayList<>();

        //  TIME COMPLEXITY=> O(n)

        for(int i=0;i<list.size();i++){
            int curr=list.get(i);
            list.remove(i);
            boolean decision1=list.contains(curr);
            list.add(i,curr);
            boolean decision2=list.contains(curr-1);
            boolean decision3=list.contains(curr+1);

            if(decision1==false && decision2==false && decision3==false){
                ans.add(curr);
            }
        }
        System.out.println(ans);
    }
    
}
