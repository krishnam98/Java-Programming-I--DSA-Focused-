import java.util.*;

public class rainwaterwithStack { 
    // TC=> O(n)
    public static int trappingrainwater(int height[]){
        // left boundary
        Stack <Integer> s=new Stack<>();
        int leftm[]=new int[height.length];
        for(int i=0;i<height.length;i++){
            int curr=height[i];
            if(!s.empty() && curr>=height[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                leftm[i]=-1;
                s.push(i);
            }

         if(curr<height[s.peek()]){
                leftm[i]=height[s.peek()];
            }
        }
 //right boundary
        Stack <Integer> s2=new Stack<>();
        int rightm[]=new int [height.length];
        for(int i=height.length-1 ;i>=0;i--){
            int curr=height[i];
            if(!s2.empty() && curr>=height[s2.peek()]){
                s2.pop();
            }

            if(s2.empty()){
                rightm[i]=-1;
                s2.push(i);
            }

            if(curr<height[s2.peek()]){
                rightm[i]=height[s2.peek()];
            }
        }  
int total=0;
        for(int k=0;k<height.length;k++){

            int i=leftm[k];
            int j=rightm[k]; 
            if(i==-1 || j==-1){
                total+=0;

            }

            else{
                int small=Math.min(i,j);
                int trappedWater=small- height[k];
                total=total+trappedWater;
            }
        }

        return total;

    }

    public static void main(String args[]){
        int height[]={7,0,4,2,5,0,6,4,0,5};
        System.out.println(trappingrainwater(height));
    }
    
}
