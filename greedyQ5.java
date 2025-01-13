public class greedyQ5 {

    public static int ispossible(int nums[],int mid){
        int tempsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(tempsum+nums[i]<=mid){
                tempsum+=nums[i];
            }
            else{
                count++; tempsum=nums[i];
            }

        }
        count++;
        return count;
    }


    public static int minsum(int nums[],int k){
        int low=0;
        int high=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low, nums[i]);
            high+=nums[i];
        }

        while(low<=high){
          int mid=(low+high)/2;
            int count=ispossible(nums,mid);
            if(count<=k){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]={7,2,5,10,8};
        int k=2;

        System.out.println(minsum(nums, k));
    }
    
}
