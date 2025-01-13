public class dandc {
    public static void mergesort(String arr[],int si,int ei){
        if(si>=ei){
            return; 
        }

        int mid= (ei+si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);

        merge(arr,si,ei,mid);


    }

    public static void merge(String arr[],int si,int ei,int mid){
        String temp[]=new String [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;k++;

            }

            else{
                temp[k]=arr[j];
                j++;k++;

            }
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String args[]){
        String arr[]={"sun","earth","mars","mercury"};
        int n=arr.length-1;
        mergesort(arr, 0, n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
