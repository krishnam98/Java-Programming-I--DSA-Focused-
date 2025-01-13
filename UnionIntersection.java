import java.util.*;

public class UnionIntersection {
    public static void UnionAndIntersection(int arr1[],int arr2[]){
       HashSet <Integer> union = new HashSet<>();
       for (Integer i : arr1) {
        union.add(i);
       }

       for (Integer i : arr2) {
        union.add(i);
       }
       System.out.println("Union= "+ union.size()+"("+union+")");

       HashSet <Integer> set1=new HashSet<>();
       HashSet <Integer> inter=new HashSet<>();
       for (Integer i : arr1) {
        set1.add(i);
       } 

       for (Integer i : arr2) {
        if(set1.contains(i)){
            inter.add(i);
        }
        
       }

       System.out.println("intersection= "+ inter.size()+"("+inter+")");


       
    }
    public static void main (String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        UnionAndIntersection(arr1, arr2);

    }
    
}
