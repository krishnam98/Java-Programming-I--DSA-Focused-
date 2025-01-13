public class lastoccurence {
   static int occur=-1;
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            if(occur!=-1){
                return occur;
            }
            else{return occur;}
        }

        if(arr[i]==key){
            occur=i;
        }

        return lastocc(arr,key,i+1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,2,4,5};
        int index=lastocc(arr, 2, 0);
        if(index==-1){
            System.out.print("not found");

        }
        else{
            System.out.print(index);
        }

    }
    
}
