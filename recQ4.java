public class recQ4 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            // spaces
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}