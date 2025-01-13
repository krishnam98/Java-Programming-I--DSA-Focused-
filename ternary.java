 import java .util.*;
 public class ternary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int larger=(5>3)?5:3;
        System.out.println(larger);
        int marks = sc.nextInt();
        String result=(marks>=33)?"pass":"fail";
        
        System.out.println(result);
    }
    
}
