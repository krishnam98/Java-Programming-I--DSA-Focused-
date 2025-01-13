import java.util.*;
public class h12w3 {
    public static void isPalindrome(int n){
        int original=n;
        int rev=0;
        for(int i=0;n>0;i++){
            int r=n%10;  // last digit
             rev= (rev*10)+r;  

             n=n/10;
        }
        if(original==rev){
            System.out.println("number is a palindrome!");

        }

        else{System.out.println("number is not a palindrome!");}
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter integer: ");
        int n=sc.nextInt();
        isPalindrome(n);
    }
    
}
