import java.util.*;

public class histogram {

   
    public static int maxAreainHistogram(int height[]){
// left boundary
        Stack <Integer> s=new Stack<>();
        int nextsmall[]=new int [height.length];
        for(int i=0;i<height.length;i++){
            int curr=height[i];
            while(!s.empty() && curr<=height[s.peek()]){
                s.pop();
            }

            if(s.empty()){
                nextsmall[i]=-1;
            }

            else{
                nextsmall[i]=s.peek();
            }

            s.push(i);
        } 

        // right boundary
        Stack <Integer> s2 =new Stack<>();
        int nextsmallr[]=new int [height.length];
        for(int i=height.length-1;i>=0;i--){
            int curr2=height[i];
            while(!s2.empty() && curr2<=height[s2.peek()]){
                s2.pop();
            }
            if(s2.empty()){
                nextsmallr[i]=(height.length);
            }

            else{
                nextsmallr[i]=s2.peek();

            }

            s2.push(i);

        }

           int max=Integer.MIN_VALUE;
        for(int k=0;k<height.length;k++){
            int i=nextsmall[k];     //left boundary
            int j=nextsmallr[k];    //right boundary

            int area=height[k]*(j-i-1);   // height*width

            max=Math.max(area,max);


        }

        return max;

    }
    public static void main(String args[]){
        int height[]={2,1,5,6,2,3};

        int maxArea=maxAreainHistogram(height);
        System.out.println("Maximum area= "+maxArea);   
      
    }
    
}
