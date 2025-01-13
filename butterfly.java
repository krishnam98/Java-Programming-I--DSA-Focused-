public class butterfly {
    public static void main(String args[]){
        // ****DIDI WALA****
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=8;j++){
        //         if(j>i && j<=8-i){
        //             System.out.print(" ");
        //         }

        //         else{System.out.print("*");}

        //     }
        //     System.out.println();
        // }

        // for(int i=5;i<=8;i++){
        //     for(int j=1;j<=8;j++){
        //         if(j==10-i && i>j){
        //             System.out.print(" ");
        //         }

        //         else{System.out.print("*");}

        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if(j<i+1 || j>8-i){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }

        for(int i=4;i>=1;i--){
            for(int j=1;j<=8;j++){
                if(j<i+1 || j>8-i){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
    
}
