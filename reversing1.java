public class reversing1 {
    public static void main(String args[]){
        int n=982003;
        int rev=0;
        while(n>0){
            int LastDigit=n%10;
            rev=(rev*10)+LastDigit;

            n=n/10;
        }
        System.out.print(rev);
    }
    
}
