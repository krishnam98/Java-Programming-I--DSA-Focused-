import java.util.*;
public class function {
    public static int sum (int a,int b){
       
        int sum = a+b;
        return sum;
        
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number1: ");
        int a=sc.nextInt();
        System.out.print("enter number2: ");
        int b=sc.nextInt();
        
        System.out.print("sum is "+  sum(a,b));


    }
    
}
