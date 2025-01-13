import java.util.*;
public class binomialcoefficient {
    public static int factorial(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product = product*i;
        }
        return product;
      
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        System.out.println("enter r: ");
        int r=sc.nextInt();
       int nfac= factorial(n);
       int rfac= factorial(r);
       int diffac= factorial(n-r);

       System.out.println( "value of binomial coefficient is: "+  nfac/(rfac*diffac));
      

        
    
}
}