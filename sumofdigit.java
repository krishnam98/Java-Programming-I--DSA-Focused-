import java.util.*;
public class sumofdigit {
    public static int sum(int n){
        int s=0;
        for(int i=0;n>0;i++){
            int r=n%10;  //last digit
            s=r+s;
            n=n/10;
        }

        return s;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("sum of digit is: " + sum(n));
    }
    
}
