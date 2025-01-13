public class pairingofarray {
    public static void pairing(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
         for(int j=1;j+i<numbers.length;j++){
            System.out.print("("+numbers[i]+","+numbers[i+j]+")  ");
            tp++;
         }
         System.out.println();
    }
    System.out.print("total pairs: "+tp);
    
 }
 public static void main(String args[]){
    int numbers[]={2,4,6,8,10,12,14};
    pairing(numbers);

 }

}
