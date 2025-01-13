import java.util.*;
public class hr {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2!=0){
            System.out.print("weird");
        }
        else if(n%2==0&&n>=2&&n<=5){
            System.out.print("not wierd");
        }
        else if(n%2==0&&n>=6&&n<=20){
            System.out.print("wierd");
        }
        else if(n%2==0&&n>20){
            System.out.print("not wierd");
        }

    }
    
}
