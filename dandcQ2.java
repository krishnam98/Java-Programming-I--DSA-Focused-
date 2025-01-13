public class dandcQ2{
    public static int countf(int nums[],int num,int lo,int hi){
        int count=0;
        for(int i=0;i<=hi;i++){
            if(nums[i]==num){
                count++;
            }
        }

        return count;

    }

    public static int majorityelement(int nums[],int lo,int hi){
        if(lo==hi){
            return nums[lo];
        }

        int mid=(hi-lo)/2 +lo;
        int left=majorityelement(nums, lo, mid);
        int right=majorityelement(nums, mid+1, hi);

        if(left==right){
            return left;
        }

        else{
            int leftcount=countf(nums,left,lo,hi);
            int rightcount=countf(nums,right,lo,hi);

            return leftcount>rightcount?left:right;
        }

        
    }

    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        int ans=majorityelement(nums, 0, nums.length-1);
        System.out.print(ans);
    }
}