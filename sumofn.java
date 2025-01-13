import java.util.*;
public class sumofn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int number=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=number){
            sum=i+sum;
            i++;
        }
        System.out.print("sum of first "+number+" natural numbers is "+sum);
 
    }
    
}
