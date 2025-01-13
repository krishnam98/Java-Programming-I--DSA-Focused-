public class creationST {
    static int tree[];
    public static void init(int n){
        tree=new int [4*n];
    }

    public static int buildST(int arr[],int i,int start,int end){
        // Base Case
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        // Left child
        int leftc=buildST(arr,2*i+1,start,mid);
        //Right child 
        int rightc=buildST(arr,2*i+2,mid+1,end);
        // Root
        tree[i]=leftc+rightc;  
        return tree[i];
    }

    public static int helper(int arr[],int i,int si,int sj,int qi,int qj){
        if(si>=qj || sj<=qi){
            return 0;
        }

        else if(qi<=si && qj>=sj){
            return tree[i];
        }

        else{
            int mid=(si+sj)/2;
            int left=helper(arr, 2*i+1, si, mid, qi, qj);
            int right=helper(arr, 2*i+2, mid+1, sj, qi, qj);

            return left+right;
        }
    }

    public static int buildsum(int arr[],int qi,int qj){
        int si=0;
        int sj=arr.length-1;
        return helper(arr, 0, si, sj, qi, qj);


    }

    public static void updateHelper(int i,int idx,int si,int sj,int diff){
        if(idx<si || idx>sj){
            return;
        }
        tree[i]+=diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateHelper(2*i+1, idx, si, mid, diff);
            updateHelper(2*i+2, idx, mid+1, sj, diff);
        }
    }

    public static void update(int arr[],int idx,int newval){
        int n=arr.length;
        int diff=newval-arr[idx];
        arr[idx]=newval;

        updateHelper(0, idx, 0, n-1, diff);



    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        update(arr, 2, 2);
        System.out.println(buildsum(arr, 2, 5));
        
    }
    
}
