public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            //shifting greater values & finding right place for insertion. 
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // INSERTION
            arr[prev+1]=curr;
        }

    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void main(String arg[]){
        int arr[]={5,4,1,3,56,45,2};
        insertion(arr);
        printarr(arr);
            

    }
    
}
