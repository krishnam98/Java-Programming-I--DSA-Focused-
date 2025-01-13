import java.util.*;

public class incometax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER YOUR INCOME: ");
        float income=sc.nextFloat();
        float tax;
        if(income<500000){
            System.out.println("NIL");
            System.out.println("THANK YOU!");
        }
        else if(income>=500000 && income<1000000){
            tax=income*0.2f;
            System.out.println("your payable tax is: "+tax);
            System.out.println("THANK YOU!");
        }

        else if(income>= 1000000){
            tax=income*0.3f;
            System.out.println("your payable tax is: "+tax);
            System.out.println("THANK YOU!");
        }

    }
    
}
