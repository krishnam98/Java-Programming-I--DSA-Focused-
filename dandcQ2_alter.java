import java.util.Random;
public class dandcQ2_alter {// import java.util.Random;

    // public class dandcQ2 {
    //     public static void quicksort(int arr[],int si,int ei){
    //         if(si>=ei){
    //             return ;
    //         }
    
    //         int pidx=partition(arr,si,ei);
    //         quicksort(arr, si, pidx-1);
    //         quicksort(arr,pidx+1,ei);
    //     }
    
    //      public static int partition(int arr[],int si,int ei){
// int pivot=ei;
// int i=si-1;
// for(int j=si;j<ei;j++){
//     if(arr[j]<=arr[pivot]){
//         i++;
//         // swap
//         int temp=arr[j];
//         arr[j]=arr[i];
//         arr[i]=temp;

//     }
// }       

// i++;
//  // swap
//  int temp=arr[pivot];
// arr[pivot]=arr[i];
//  arr[i]=temp;

//  return i;


    
        
    //     public static int majority(int arr[]){
    //         int n=arr.length;
    //         int i=0;
    //         while(i<=n-2){
    //            int count=1;
    //            while(arr[i]==arr[i+1]){
    
    //             count++;
    //             i++;
    //            }
    
    //            if(count>(n/2)){
    //             i--;
    //             return arr[i];
    //            }
    
    //         }
    
    //         return 0;
            
    
    //     }
    
    //     public static void main(String args[]){
    //         int arr[]={3,2,3};
    //         int n=arr.length-1;
    //         quicksort(arr, 0, n); 
    //         System.out.print(majority(arr));
    //     }
        
    // }
    
    
    
    
    
    
        public static void quicksort(int arr[],int si,int ei){
            if(si>=ei){
                return ;
            }
    
            int pidx=partition(arr,si,ei);
            quicksort(arr, si, pidx-1);
            quicksort(arr,pidx+1,ei);
        }
    
        public static int partition(int arr[],int si,int ei){
            Random rand = new Random();
            int randomIndex = rand.nextInt(ei - si + 1) + si;
            int pivot=arr[randomIndex];
            int i=si-1;
            int temp=0;
             
            for(int j=si;j<ei;j++){
                if(arr[j]<pivot){
                    i++;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
    
                }
    
    
            }
    
            temp=arr[i+1];
            arr[i+1]=arr[ei];
            arr[ei]=temp;
    
            return i+1;
            
        }
    
        public static int majority(int arr[]){
            int n=arr.length;
            int i=0;
            while(i<=n-2){
               int count=1;
               while(arr[i]==arr[i+1]){
    
                count++;
                i++;
               }
    
               if(count>(n/2)){
                i--;
                return arr[i];
               }
    
            }
    
            return 0;
            
    
        }
    
        public static void main(String args[]){
            int arr[]={3,2,3};
            int n=arr.length-1;
            quicksort(arr, 0, n); 
            System.out.print(majority(arr));
        }
        
    
    
    
    
}

