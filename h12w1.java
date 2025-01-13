import java.util.*;
public class h12w1 {
    public static float average(float a,float b,float c){
       float avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number1: ");
         float a=sc.nextFloat();

         System.out.print("enter number2: ");
         float b=sc.nextFloat();

         System.out.print("enter number3: ");
         float c=sc.nextFloat();

         System.out.print("THE AVERAGE OF THREE NUMBERS IS: "+average(a,b,c));
    }
    
}
