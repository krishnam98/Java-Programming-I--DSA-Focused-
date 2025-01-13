public class arrayassQ1 {
    public static boolean repeatativevalue(int nums[]){
        boolean decision=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    decision=true;
                }
            }
        }
        return decision;
    }

    public static void main(String args[]){
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        System.out.print(repeatativevalue(nums));
    }
    
}
