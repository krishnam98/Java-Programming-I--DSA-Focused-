import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.println("enter number");                             
        int n=sc.nextInt();
        boolean k=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                k=false;
            }
            
            
        }
        if(k==false){
            System.out.println("not a prime number");
        }
        else{System.out.println("a prime number");}

    }
    
}
