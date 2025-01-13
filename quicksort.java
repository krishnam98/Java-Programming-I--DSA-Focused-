public class quicksort {
    public static  void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
       
        int pidx=partition(arr, si, ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr,pidx+1,ei);

    }

    public static int partition(int arr[],int si,int ei){
int pivot=ei;
int i=si-1;
for(int j=si;j<ei;j++){
    if(arr[j]<=arr[pivot]){
        i++;
        // swap
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }
}       

i++;
 // swap
 int temp=arr[pivot];
arr[pivot]=arr[i];
 arr[i]=temp;

 return i;


    }
    

    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        int n= arr.length-1;
        quicksort(arr, 0,n);
        for(int i=0;i<=n;i++){
             System.out.print(arr[i]+" ");
            }

    }
}
