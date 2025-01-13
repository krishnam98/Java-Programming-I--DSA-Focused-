public class set_ithbit {
    public static void set_ibit(int n,int i){
        int bitMask=1<<i;
        System.out.print(n|(bitMask));
    }

    public static void main(String args[]){
        int n=10;
        int i=2;
        set_ibit(n, i);
    }
    
}
