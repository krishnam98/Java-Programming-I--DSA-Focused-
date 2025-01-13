public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }
        int fibno=fib(n-1)+fib(n-2);
        return fibno;
    }

    public static void main(String args[]){
        System.out.print(fib(4));
    }
    
}
