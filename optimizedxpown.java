public class optimizedxpown {
    public static int optimizedpow(int x,int n){
        if(n==1){
            return x;
        }
        int halfpow=optimizedpow(x, n/2);
        int power=halfpow*halfpow;

        if(n%2!=0){
           
            power=x*halfpow*halfpow;
            return power;
        }

      

       return power;

    }

    public static void main(String args[]){
        System.out.print(optimizedpow(2, 1000));
    }
    
}
