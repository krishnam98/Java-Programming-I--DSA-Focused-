public class sumrec {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sn=n+sum(n-1);
        return sn;
    }

    public static void main(String args[]){
        System.out.print(sum(4));
    }
    
}
