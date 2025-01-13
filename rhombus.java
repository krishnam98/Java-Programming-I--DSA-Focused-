public class rhombus {
    public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){

            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        
    }

    public static void main(String args[]){
        solidrhombus(5);
    }    
}
