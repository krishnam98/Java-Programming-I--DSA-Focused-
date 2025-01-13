import java.util.*;
public class range_of_prime {
public static boolean prime(int n){
    boolean isprime=true;
    if(n==2){return isprime;}
    for (int i=2;i<n;i++){
        if(n%i==0){isprime=false;}
        
    }
    return isprime;
}

    public static void prime_range(int n){
      for(int i=2;i<=n;i++){
        if(prime(i)==true){
            System.out.println(i);
        }
      }

    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("prime numbers are:- ");

        prime_range(n);
    }
}
