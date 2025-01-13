public class power3 {
    public static double power(double a,double n){
        if(n==0){
            return  1;
        }

       double hp=power(a,n/2);

       double total=hp*hp;

        if(n%2!=0){
            return a*total;
        }

        return total;
    }

    public static void main(String args[]){
        System.out.print(power(2,100));

    }
    
}
