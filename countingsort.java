public class countingsort {
    //counting sort function
    public static void countingSort(int arr[]){
        //finding largest number
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }

        int count[]= new int [largest+1];
        // storing frequencies of elements of given array;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){//jitni value element ki hogi(count array me) utni baar hum count array ka index given array mein daalte jayenge
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }
//printing array function
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    // driver code
    public static void main(String args[]){
        int arr[]={1,4,1,3,4,2,7};
        countingSort(arr);
        printArray(arr);
    }


    
}
