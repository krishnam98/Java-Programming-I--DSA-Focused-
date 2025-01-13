import java.util.Arrays;

public class minabsdiff {
    public static void main(String args[]){
        int arr_A[]={10,20,30};
        int arr_B[]={15,30,45};
        int Mindiff=0;
    

        Arrays.sort(arr_A);
        Arrays.sort(arr_B);

        for(int i=0;i<arr_A.length;i++){
            Mindiff+=Math.abs(arr_A[i]-arr_B[i]);
        }

        System.out.println("Minimum difference is = "+Mindiff);
    }
    
}
