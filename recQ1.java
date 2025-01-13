public class recQ1 {
    public static void printoccur(int arr[],int i,int key){
        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.print(i+" ");
        }

        printoccur(arr,i+1,key);
    }

    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        printoccur(arr, 0, 2);
    }
    
}
