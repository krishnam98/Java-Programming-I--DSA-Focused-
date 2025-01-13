public class bsaQ2{
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int big=i;
            for(int j=i+1;j<n;j++){
                if(arr[big]<arr[j]){
                    big=j;
                }
            }
            // swap
            int temp=arr[big];
            arr[big]=arr[i];
            arr[i]=temp;

        }
        
    }

    // printing array
     public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printArray(arr);
    }
  
    
}
