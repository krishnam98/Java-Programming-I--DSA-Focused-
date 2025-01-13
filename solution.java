public class solution {
    
        public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
        public static int merge(int arr[],int si,int mid,int ei){
            int temp[]=new int [ei-si+1];
            int i=si;
            int j=mid+1;
            int invcount=0;
            int k=0;
            
            while(i<mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    k++; i++;
    
                }
    
                else{
                    temp[k]=arr[j];
                     invcount++;
                    k++; j++;
    
                }
            }
    
            while(i<mid){
                temp[k]=arr[i];
                k++;i++;
            }
    
            while(j<=ei){
                
invcount++;
                temp[k]=arr[j];

                k++; j++;
            }
    
            // copying in arr
    
            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }

            return invcount;
        }
    
        public static int mergesort(int arr[],int si,int ei){
            int invcount=0;
           
          if(ei>si){
             int mid= si+(ei-si)/2;
    
            invcount=mergesort(arr, si, mid);   //left part
            invcount+=mergesort(arr,mid+1,ei);   //right part
    
            invcount+=merge(arr,si,mid+1,ei);
        }
        return invcount;
        }
    
        public static void main(String args[]){
            int arr[]={2,4,1,3,5};
            int n=arr.length-1;
           System.out.print(mergesort(arr, 0, n));
            
        }
        
    }
    
    

