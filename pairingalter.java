public class pairingalter {
    public static void pairing(int nums[]){
        int total=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print(nums[i]+","+nums[j]+" ");
                total++;
            }
            System.out.println();
        }
        System.out.print(total);
    }

    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12,14};
        pairing(nums);
    }
    
}
