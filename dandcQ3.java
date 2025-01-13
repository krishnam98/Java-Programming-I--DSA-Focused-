public class dandcQ3 {

    public static int merge(int nums[],int lo,int hi,int mid){
        int i=lo;
        int j=mid;
        int k=0;
        int invcount=0;
        int temp []=new int[hi-lo+1];
        while(i<mid && j<=hi){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;k++;
            }

            else{
                temp[k]=nums[j];
                invcount+=(mid-i);
                j++;k++;
            }

        }

        while(i<mid){
            temp[k]=nums[i];
            i++;k++;
        }
        while(j<=hi){
            temp[k]=nums[j];
            j++;k++;
        }

        for(k=0,i=lo;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
        return invcount;
    }
    public static int mergesort(int nums[],int lo,int hi){
        int invcount=0;

        if(hi>lo){
            int mid= (hi+lo)/2;
            invcount=mergesort(nums,lo,mid);
            invcount+=mergesort(nums,mid+1,hi);
            invcount+=merge(nums,lo,hi,mid+1);

        }

        return invcount;

    }

    public static void main(String args[]){
        int arr[]={2,4,1,3,5};
        System.out.print(mergesort(arr, 0, arr.length-1));
    }
    
}
