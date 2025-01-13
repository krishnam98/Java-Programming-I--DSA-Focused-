public class firstoccurence{
    public static int firstocc(int arr[],int key,int i){
        if(i==arr.length){
            return (-1);
        }

        if(arr[i]==key){
            return i;
        }

         return firstocc(arr,key,i+1);

    }

    public static void main(String args[]){
        int arr[]={1,2,3,2,4,5};
        int index=firstocc(arr, 7, 0);

        if(index==-1){
            System.out.print("NOT FOUND!");
        }

        else{System.out.print(index);}

    }
}