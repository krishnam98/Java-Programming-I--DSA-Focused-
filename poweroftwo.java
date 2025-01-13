public class poweroftwo {
    public static boolean IsPowerofTwo(int n){
        return (n&n-1)==0;
    }

    public static void main(String args[]){
        int n=8;
        System.out.print(IsPowerofTwo(n));
    }
    
}
