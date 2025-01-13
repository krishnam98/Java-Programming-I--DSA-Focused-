public class clearLast_ibits {

    public static void clearLastibits(int n,int i){
        int bitMask=((~0)<<i);
        System.out.print(n&bitMask);
    }
    public static void main(String args[]){
        int n=15,i=2;
        clearLastibits(n, i);

    }
    
}
