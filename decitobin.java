import java.util.*;
public class decitobin {
    public static int deci_bin(int n){
        int d=0;
        for(int i=0;n> 0;i++){
            int r=n%2;
            d= d+ (r*(int) Math.pow(10,i));
            n=n/2;
          
        }
    return d;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number from decimal number system: ");
    int n=sc.nextInt();
    
    System.out.print(deci_bin(n));
}
    
}
