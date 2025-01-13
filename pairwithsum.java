public class pairwithsum {
    public static int findpivot(int arr[]){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;

            if(arr[si]>arr[mid] && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[ei]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid+1;
            }

            if(arr[si]>arr[mid]){
                ei=mid+1;
            }

            else{
                si=mid-1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int arr[]={11,15,6,8,9,10};
        int sum=16;
        int n=arr.length;

       int pivot=findpivot(arr);

       int r=pivot;
       int l=pivot+1;

       while(r!=l){
        int temp=arr[r]+arr[l];

        if(temp==sum){
            System.out.println(true);
            return;
        }

        if(temp>sum){
            r= (n+r-1)%n;
        }

        else{//temp<sum
            l= (l+1)%n;

        }
       }
       System.out.println(false);


    }
    
}
