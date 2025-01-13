import java.util.ArrayList;

public class alQ3 {
     public static int isfrequent(ArrayList<Integer> list,int key){
        int ans=0;int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
            int count=0;
            if(list.get(i)==key){
                if(list.get(i+1)!=ans){
                    int target=list.get(i+1);
                     for(int j=1;j<list.size();j++){
                        if(list.get(j)==target){
                            if(list.get(j-1)==key){
                                count++;
                            }
                        }
                     }

                     if(max<count){
                        max=count;
                        ans=target;
                     }

                }

            }
        }

        return ans;
     }

     public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(isfrequent(list, 2));

     }
    
}
