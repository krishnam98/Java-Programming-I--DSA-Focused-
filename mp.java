public class mp {
    public static void main(String args[]){
       
       
        for(int i=1;i<=4;i++){

             // spaces
        for(int j=4-i;j>=0;j--){
            System.out.print(" ");
        }

            // stars
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }

            System.out.println();

        }

    }
    
}
