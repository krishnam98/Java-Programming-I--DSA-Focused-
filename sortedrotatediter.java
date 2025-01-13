public class sortedrotatediter {
    public static int searchiter(int arr[],int si,int ei,int target){
        while(si<=ei){
            int mid= (si+ei)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(arr[si]<=arr[mid]){
                if(arr[si]<=target && target<arr[mid]){
                 ei=mid-1;
                }
    
                else{
                  si=mid+1;
                }
    
            }

            else{
                if(arr[mid]<target && target<=arr[ei]){
                    si=mid+1;
                }
    
                else{
                  ei=mid-1;
                }
            }
    
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.print(searchiter(arr,0, arr.length-1,9));  
  }
    
}
