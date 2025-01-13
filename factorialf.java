import java.util.*;
public class factorialf {
    public static int factorial(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product = product*i;
        }
        return product;
      
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
       int ans= factorial(n);
       System.out.print("factorial of "+n+" is "+ans);

        
    }
    
}
