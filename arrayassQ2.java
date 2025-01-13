public class arrayassQ2 {
    //TO FIND PIVOT
    public static int findpivot(int arr[]){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int pivot=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[low]>arr[mid]&&arr[mid-1]>arr[mid]){
                pivot=mid-1;
                return pivot;
            }
            if(arr[high]<arr[mid]&&arr[mid]>arr[mid+1]){
                pivot=mid;
                return pivot;
            }

            else{
                if(arr[low]<arr[mid]){
                    low =mid+1;
                }
               else{high=mid-1;}
            }
        }
        return pivot;
    }

    //BASIC BINARY SEARCH FUNCTION
    public static int binarysearch(int arr[],int low,int high,int key){
        while(high>=low){
            int mid=(high+low)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]>key){
                high=mid-1;
            }
            else{low=mid+1;}
        }
        return -1;

    }
    //FINDING KEY
    public static int findkey(int arr[],int key){
        int n=arr.length;
        int pivot=findpivot(arr);
        if(arr[0]>key){
            return binarysearch(arr, pivot+1, n-1, key);
        }
        else{
            return binarysearch(arr, 0, pivot, key);
        }
    }

    public static void main(String args[]){
        int arr[]={4,5,6,1,2,3};
        int key=1;
        System.out.print("YOUR KEY IS AT INDEX: "+findkey(arr, key));

    }
    
    
}

   


