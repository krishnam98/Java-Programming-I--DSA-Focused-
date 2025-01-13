public class xpown {
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
        int power=x * pow(x,n-1);

        return power;

    }

    public static void main(String args[]){
        System.out.print(pow(2,10));
    }
    
}
