import java.util.*;
public class floydtriangle {
    public static void floyds_triangle(int n){
        int j=1;
        for(int i=1;i<=n;i++){
            int f=1;
            while(f<=i){
                System.out.print(j + " ");
                j++;
                f++;
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n=sc.nextInt();

        floyds_triangle(n);

    }
    
}
