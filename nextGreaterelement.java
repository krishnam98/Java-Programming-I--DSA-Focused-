import java.util.*;
public class nextGreaterelement {
    public static void nxtgreaterElement(int arr[]){
        Stack <Integer> s= new Stack<>();
        int nextG[]=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.empty() && curr>=arr[s.peek()]){
                s.pop();
            }

            if(s.empty()){
                nextG[i]=-1;
                
            }
            else{
                nextG[i]=arr[s.peek()];

            }

            s.push(i);
        }

        for(int i=0;i<nextG.length;i++){
            System.out.print(nextG[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};

        System.out.println("arr:-");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Next Greater Element:-");

        nxtgreaterElement(arr);

        
       
       
    }
    
}
