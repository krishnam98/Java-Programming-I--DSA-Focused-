import java.util.*;
public class continuef{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter number");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("number entered: "+num);

        }

    }

}