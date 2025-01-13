public class mergesorting {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++; i++;

            }

            else{
                temp[k]=arr[j];
                k++; j++;

            }
        }

        while(i<=mid){
            temp[k]=arr[i];
            k++;i++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            k++; j++;
        }

        // copying in arr

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid= si+(ei-si)/2;

        mergesort(arr, si, mid);   //left part
        mergesort(arr,mid+1,ei);   //right part

        merge(arr,si,mid,ei);
    }

    public static void main(String args[]){
        int arr[]={2,5,3,9,7,56,44};
        int n=arr.length-1;
        mergesort(arr, 0, n);
        print(arr);
    }
    
}
