import java.util.*;


public class Queue1 {
    public static void printBinary(int n){
        Queue <String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String str1=q.remove();
            System.out.print(str1+" ");
            q.add(str1+"0");
            q.add(str1+"1");
        }

    }

    public static void main(String args[]){
        printBinary(5);
    }
    
}
