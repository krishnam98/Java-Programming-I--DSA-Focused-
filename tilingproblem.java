public class tilingproblem {
    public static int tillingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }

        int verticle=tillingproblem(n-1);
        int horizontal=tillingproblem(n-2);

        int ways=verticle+horizontal;

        return ways;

    }

    public static void main(String args[]){
        System.out.print(tillingproblem(4));
    }
    
}
