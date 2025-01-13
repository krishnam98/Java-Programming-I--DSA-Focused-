public class binarys {

    public static void binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1; 

        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
            else{start=mid+1;}
        }
         return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,1,2,1,3};
        int key=1;
        
    
        int index=binarysearch(numbers,key);
        if(index==-1){
            System.out.println("NOT FOUND!");

        }

        else{System.out.println("key is at index: "+index);}
    }
    
}
