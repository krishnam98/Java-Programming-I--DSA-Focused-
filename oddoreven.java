import java.util.*;
public class oddoreven {
// FINDING A NUMBER IS EVEN OR ODD USING BIT MANIPULATION;

    public static void oddEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.print("number is even!");
        }
        else{
            System.out.print("number is odd!");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER ");
        int n=sc.nextInt();
        oddEven(n);
    }
    
}
