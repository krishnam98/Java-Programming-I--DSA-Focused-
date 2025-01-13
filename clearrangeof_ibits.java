public class clearrangeof_ibits {
    public static void clear_rangeofibits(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=((1<<(i))-1);
        int bitmask=a|b;
        System.out.print(n&bitmask);
    }
    public static void main(String args[]){
        int n=10,i=2,j=4;
        clear_rangeofibits(n, i, j);

    }
    
}
