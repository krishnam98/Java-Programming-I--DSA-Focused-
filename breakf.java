import java.util.*;
public class breakf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println("number entered= "+num);
           
        }
        System.out.println("YOU HAVE ENTERED A MULTIPLE OF 10!");

    }
    
}
