import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }

        System.out.println();

        // arranging a section
        int arr2[]={5,4,1,3,2};
        Arrays.sort(arr2,0,3);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }

        System.out.println();

        // for descending order
       Integer arr3[]={5,4,1,3,2};
        Arrays.sort(arr3,Collections.reverseOrder());
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }

        System.out.println();

        // for descending order of a section
        Integer arr4[]={5,4,1,3,2};
        Arrays.sort(arr4,0,4,Collections.reverseOrder());
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]);
        }




    }
    
}
