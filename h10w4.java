import java.util.*;
public class h10w4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER: ");
        int number= sc.nextInt();
        int product;
        System.out.println("table of "+number);
        for(int i=1;i<=10;i++){
            product=number*i;
            System.out.println(number+"*"+i+"="+product);

        }
       
    }
    
}
