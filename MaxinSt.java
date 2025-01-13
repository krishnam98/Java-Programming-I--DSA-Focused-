public class MaxinSt {
    static int  tree[];
    public static void init(int n){
        tree=new int[4*n];
    }

    public static int buildtree(int arr[],int i,int si,int sj){
        if(si==sj){
            tree[i]=arr[si];
            return tree[i];
        }

        int mid=(si+sj)/2;
        int leftpart=(buildtree(arr, 2*i+1, si, mid));
        int rightpart=buildtree(arr, 2*i+2, mid+1, sj);
        tree[i]=Math.max(leftpart,rightpart);
        return tree[i];

    }

    public static int findmax(int i,int si,int sj,int qi,int qj){
        if(qi>=sj || qj<=si){
            return Integer.MIN_VALUE;
        }

        else if(qi<=si && qj>=sj){
            return tree[i];
        }
        
        else{
            int mid=(si+sj)/2;
            int leftpart=findmax(2*i+1, si, mid, qi, qj);
            int rightpart=findmax(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftpart, rightpart);
        }
    }

     public static int findmin(int i,int si,int sj,int qi,int qj){
        if(qi>=sj || qj<=si){
            return Integer.MAX_VALUE;
        }

        else if(qi<=si && qj>=sj){
            return tree[i];
        }
        
        else{
            int mid=(si+sj)/2;
            int leftpart=findmin(2*i+1, si, mid, qi, qj);
            int rightpart=findmin(2*i+2, mid+1, sj, qi, qj);
            return Math.min(leftpart, rightpart);
        }
    }

    public static void helper(int i,int idx,int si,int sj,int newval){
        // non overlappinh
        if(idx<si || idx>sj){
            return ;
        }
        // overlapping main leafnode 
        if(si==idx && si==sj){
            tree[i]=newval;
            return;
        }

        if(si!=sj){
            int mid=(si+sj)/2;
            helper(2*i+1,idx,si,mid,newval);
            helper(2*i+2, idx, mid+1, sj, newval);

            tree[i]=Math.max(tree[2*i+1], tree[2*i+2]);

        }
    }

    public static void helperMin(int i,int idx,int si,int sj,int newval){
        // non overlappinh
        if(idx<si || idx>sj){
            return ;
        }
        // overlapping main leafnode 
        if(si==idx && si==sj){
            tree[i]=newval;
            return;
        }

        if(si!=sj){
            int mid=(si+sj)/2;
            helperMin(2*i+1,idx,si,mid,newval);
            helperMin(2*i+2, idx, mid+1, sj, newval);

            tree[i]=Math.min(tree[2*i+1], tree[2*i+2]);

        }
    }

    public static void update(int arr[],int idx,int newval){
        int n=arr.length;
        helper(0, idx, 0, n-1, newval);
        // helperMin(0, idx, 0, n-1, newval);

    }

    public static void main(String args[]){
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);
        buildtree(arr, 0, 0, n-1);
        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        System.out.println(findmax(0, 0, n-1, 3, 5)); // max is 17
        update(arr, 4, 6);
        System.out.println(findmax(0, 0, n-1, 3, 5));  // max is 6
        System.out.println(findmin(0, 0, n-1, 3, 5));  

          

    }
    
}
