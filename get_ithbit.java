public class get_ithbit {
    public static void get_i_bit(int n,int i){
        int bitmask =1<<i;
        if((n&bitmask)==0){
            System.out.print("ith bit is 0");
        }

        else{
            System.out.print("ith bit is 1");

        }
    }
    public static void main(String args[]){
        int n=8;
        int i=3;
        get_i_bit(n, i);
    }
}
