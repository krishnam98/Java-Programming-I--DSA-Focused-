import java.util.*;
public class h12w2 {
    public static boolean isEven(int n){
        boolean ans=true;
        if(n%2!=0){ans=false;}

        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
    
}
