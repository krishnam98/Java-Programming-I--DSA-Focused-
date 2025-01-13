public class countsetbits {
    public static int countbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){  //n&1 se hume jo value milti h wahi n ki LSB ki value hoti ha 
                count++;
            }
            n=(n>>1);
        }
        return count;
    }

    public static void main(String args[]){
        int n=15;
       System.out.print("number of set bits= "+countbits(n));
    }
}
