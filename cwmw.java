import java.util.ArrayList;
public class cwmw{
public static int Storewater(ArrayList<Integer>height){
     int ans=Integer.MIN_VALUE;
    int heightT; 

    // time complexity => O(n^2)
    for(int i=0;i<height.size()-1;i++){
        for(int j=i+1;j<height.size();j++){
            int width=j-i;
            if(height.get(j)<=height.get(i)){
                heightT=height.get(j);
            }

            else{
                heightT=height.get(i);
            }
            int answer=width*heightT;
            ans=Math.max(ans,answer);        }
    }
    return ans;


}

public static int Storewater2(ArrayList<Integer> height){
    int lp=0;   //left pointer
    int rp=height.size()-1;    //right pointer
    int water = Integer.MIN_VALUE;


// TIME COMPLEXITY => O(n)

    while(lp<rp){
        int width=rp-lp;
        int column = Math.min(height.get(lp),height.get(rp));
        int waterar= width*column;
         water=Math.max(water,waterar);

        if(height.get(lp)<height.get(rp)){
            lp++;
        }
       else{rp--;}
    }

    return water;
}

public static void main(String args[]){

    ArrayList <Integer> height=new ArrayList<>();

    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
// BRUTE FORCE APPROACH  TIME COMPLEXITY= O(n^2)
//    int result=Storewater(height);

// 2 pointer approach TIME COMPLEXITY= O(n)
int result=Storewater2(height);
    System.out.println(result);


    
}
}