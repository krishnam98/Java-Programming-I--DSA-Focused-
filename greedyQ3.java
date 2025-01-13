import java.util.*;

public class greedyQ3 {
    public static void lexicographicstr(int n,int k){
        char arr[]=new char [n];

        for(int i=0;i<n;i++){
            arr[i]='a';
        }

        k=k-(n-1);

        for(int i=n-1;i>=0;i--){
            int x=Math.min(26,k);
           arr[i]+=x-1;
            k=k-x+1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n=5;int k=73;
        lexicographicstr(n, k);

    }
    
}
