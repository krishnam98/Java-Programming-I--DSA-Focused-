public class arrayassQ4 {
    public static int trappedwater(int height[]){
        int n=height.length;
        //LeftMaxBoundary
     int leftmax[]=new int [n];
     leftmax[0]=height[0];
     for(int i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
     }
     //RightMaxBoundary
     int rightmax[]=new int [n];
     rightmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]); 
     }
     //trapped water
     int total=0;
     for(int i=0;i<n;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        int trappedwater=waterlevel-height[i];
        total=total+trappedwater;
     }
     return total;
    }

    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(trappedwater(height));
    }
    
}
