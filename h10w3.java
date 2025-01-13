import java.util.*;
public class h10w3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int n=sc.nextInt();
        int product=1;

        for(int i=1;i<=n;i++){
            product=i*product;
        }
        System.out.println("FACTORIAL OF "+n+" is "+product);

    }
    
}
