public class selectionsort {
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int small=i;
            for(int j=i+1;j<n;j++){//index of minimum value
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            // swap
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

    } 
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,2,3};
        selectionsort(arr);
        printarray(arr);
    }
    
}
