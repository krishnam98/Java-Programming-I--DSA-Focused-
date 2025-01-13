public class pivot {
    public static int findpivot(int arr[]){
        int pivot=-1;
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(high>=low){
            int mid =(high+low)/2;

            if(arr[mid]<arr[low]&&arr[mid-1]>arr[mid]){
                pivot=mid-1;
                return pivot;
                
            }
            if(arr[mid]>arr[high]&&arr[mid+1]<arr[mid]){
                pivot=mid;
                return pivot;
            }

            else{
                if(arr[mid]>arr[low]){
                    low=mid+1;
                }
                else{high=mid-1;}
            }
        }
        return pivot;

    }

    public static void main(String args[]){
        int arr[]={4,5,6,1,2,3};
       System.out.print(findpivot(arr));
    }
    
}
