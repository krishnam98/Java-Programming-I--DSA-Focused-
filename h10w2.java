import java.util.*;
public class h10w2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number;
        int evensum=0;
        int oddsum=0;
        int choice;
        while(true){
            System.out.print("enter number");
            number=sc.nextInt();
            if(number%2==0){
                evensum=evensum+number;
            }

            else{oddsum=oddsum+number;}

            System.out.println("press 1 to continue or press 0 to stop");
            choice=sc.nextInt();
            if(choice==0){
                break;
            }

        }

        System.out.println("sum of even numbers is = "+evensum);
        System.out.println("sum of odd numbers is = "+oddsum);


    }
    
}
