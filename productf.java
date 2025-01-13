import java.util.*;

public class productf {

    public static int product (int a,int b){
        int prod=a*b;
        return prod;
    
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=sc.nextInt();
        System.out.print("enter b: ");
        int b=sc.nextInt();

        int answer=product(a,b);

        System.out.println("procuct is: "+answer);


    }
    
}
