public class trappingrainwater {
    public static int trappedwater(int height[]){
        int n=height.length;
        // leftmaxboundary
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]); 
        }

        // rightmaxboundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int total=0;
        for(int i=0;i<n;i++){
            // finding waterlevel
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            // calculating trapped water
            int trappedwater=waterlevel-height[i];
            total = trappedwater+total;
        }

        return total;
    }

    public static void main(String args[]){
        int height[]={3,2,5,4,6,5};
       System.out.print("Total volume of water trapped= "+ trappedwater(height));
    }
    
}
