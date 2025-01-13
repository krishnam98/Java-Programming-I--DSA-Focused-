import java.util.*;
public class IR_P_Numb {
    public static void IRPN(int totrow){
        for(int i=totrow;i>=1;i--){
            for(int j=1;j<=i;j++){     //NUMBERS
               System.out.print(j);
            }

            System.out.println();
        }
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows of pyramid: ");
int totrow=sc.nextInt();
IRPN(totrow);
}
    
}
