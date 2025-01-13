import java.util.*;

public class twoSum {
    public static ArrayList<Integer> getTwoSum(int arr[],int x){
        ArrayList <Integer> list=new ArrayList<>();
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(x-arr[i])){
                list.add(map.remove(x=arr[i]));
                list.add(i);
            }
            else{
                map.put(arr[i], i);
            }

        }
        return list;

        
    }
    public static void main(String args[]){
        int arr[]={3,3};
        ArrayList <Integer> list=getTwoSum(arr, 6);
        System.out.println(list);
    }
    
}
