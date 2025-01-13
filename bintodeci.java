import java.util.*;
public class bintodeci {
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter number of binary system(0 and 1 only): ");
        int n=sc.nextInt();
        int b=0;
        for(int i=0;n>0;i++){
            int r=n%10;
            b=b+ (r*(int) Math.pow(2,i));
            n=n/10;
        }

        System.out.println(b);
    }

    
}
