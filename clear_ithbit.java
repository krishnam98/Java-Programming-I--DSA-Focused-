public class clear_ithbit {
    public static void clear_ibit(int n,int i){
        int bitMask=1<<i;
        System.out.print(n&(~(1<<i)));
    }

    public static void main(String args[]){
        int n=10;
        int i=1;
        clear_ibit(n, i);
    }
    
}
