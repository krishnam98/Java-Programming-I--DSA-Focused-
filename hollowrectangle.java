import java.util.*;
public class hollowrectangle {
    public static void hollowrec(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || i==totrow || j==1 || j==totcol ){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter length: ");
        int totrow=sc.nextInt();

        System.out.print("Enter width: ");
        int totcol=sc.nextInt();

        hollowrec(totrow, totcol);





    }
    
}
