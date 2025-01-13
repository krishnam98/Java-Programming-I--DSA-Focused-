import java.util.ArrayList;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }


    public static Node insert(Node root,int val){
        if(root==null){
            Node newnode=new Node(val);
            root=newnode;
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);  //insert in left node
        }
        else{
            root.right=insert(root.right, val);   //insert in right node
        }

        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        else if(root.data>key){
             return search(root.left, key);
        }

        else{
            return search(root.right, key);
        }


    }

    public static Node inordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;

    }

    public static Node delete(Node root,int n){
        if(root.data<n){
            root.right=delete(root.right, n); //right st se value delete rst ka root node right me laga denge hamari official root node mein
        }

        else if(root.data>n){
            root.left=delete(root.left, n);
        }

        else{

            if(root.left==null && root.right==null){
                return null;
            }

            if(root.left==null){
                return root.right;
            }

            else if(root.right==null){
                return root.left;
            }
            
            Node isn=inordersuccessor(root.right);
            root.data=isn.data;
            root.right=delete(root.right, isn.data);  //inordersuccessor ko apni original position se delete karke aur new st ko return kiya

        }

        return root;

    }

    public static void printrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        if(root.data>=k1 && root.data<=k2){
            printrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printrange(root.right, k1, k2);

        }
        else if(root.data>k1){
            printrange(root.left, k1, k2);
        }
        else{
            printrange(root.right, k1, k2);
        }
    }
      

    public static void printroot_to_leaf_utility(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null && root.right==null){
            System.out.println(path);
        }

        printroot_to_leaf_utility(root.left,path);
        printroot_to_leaf_utility(root.right,path);

        path.remove(path.size()-1);


    }
    public static void print_root_to_leaf(Node root){
        ArrayList <Integer> path=new ArrayList<>();
        printroot_to_leaf_utility(root, path);
    }

    public static boolean isvalidbst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){     // node under consideration is in rst and its value is less than root node
            return false;
        }

        if(max!=null && root.data>=max.data){    // node under consideration is in lst and its value is greater than root node
            return false;
        }

        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max); // when both lst and rst both are true then only it will be a valid BST
    }

    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }

        Node leftst=mirrorBST(root.left);
        Node rightst=mirrorBST(root.right);

        root.left=rightst;
        root.right=leftst;

        return root;

    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
}

public static Node creat_tree(int arr[],int start,int end){
    if(start>end){
        return null;
    }

    int mid=(start+end)/2;
    Node root=new Node(arr[mid]);
    root.left=creat_tree(arr, start, mid-1);
    root.right=creat_tree(arr, mid+1, end);

    return root;
}

public static ArrayList<Integer> inorderadd(Node root,ArrayList<Integer>list){
    if(root==null){
        return list;
    }

    inorderadd(root.left, list);
    list.add(root.data);
    inorderadd(root.right, list);

    return list;

}
public static Node convertbst2(int start,int end,ArrayList <Integer> list2){
  if(start>end){
    return null;
  }
  if(start==end){
    return new Node(list2.get(start));
  }
    int mid=((start+end)/2)+1;
    Node root=new Node(list2.get(mid));
    root.left=convertbst2(start, mid-1, list2);
    root.right=convertbst2( mid+1, end, list2);

     return root;

}
public static class Info{
    boolean isbst;
    int size;

    public Info(boolean isbst,int size){
        this.isbst=isbst;
        this.size=size;
    }
}
 public static int maxbst=0;
public static Info largestBST(Node root,Node max,Node min){
    if(root==null){
        return new Info(true, 0);
    }
    Info left = largestBST(root.left, root, min);
    Info right = largestBST(root.right, max, root);

    int size=left.size+right.size+1;


    if(min!=null && root.data<=min.data){
        return new Info(false, size);
    }

    if(max!=null && root.data>=max.data){
        return new Info(false, size);
    }

    if(left.isbst && right.isbst){
        maxbst=Math.max(maxbst, size);
        return new Info(true, size);
    }
    return new Info(false, size);
} 

public static Node mergeBST(Node root1,Node root2){
     ArrayList <Integer> mergerList1=new ArrayList<>();
     ArrayList <Integer> mergerList2=new ArrayList<>();
    ArrayList <Integer> inoerder1= inorderadd(root1,mergerList1);
    ArrayList <Integer> inoerder2= inorderadd(root2,mergerList2);

    int i=0;
    int j=0;
    
    ArrayList <Integer> mergerList=new ArrayList<>();
    while(i<inoerder1.size() && j<inoerder2.size()){
        if(inoerder1.get(i)<=inoerder2.get(j)){
            mergerList.add(inoerder1.get(i));
            i++;
            
        }

        else{
            mergerList.add(inoerder2.get(j));
            j++;
            
        }
         
    }

    while(j<inoerder2.size()){
         mergerList.add(inoerder2.get(j));
            j++;
            
        
    }

    while(i<inoerder1.size()){
        mergerList.add(inoerder1.get(i));
            i++;
            

    }

    Node res= convertbst2(0, mergerList.size()-1, mergerList);
    return res;


}
 static int sum=0;
public static int rangesum(Node root){
    if(root==null){
        return sum;

    }

    if(root.data>=5 && root.data<=11){
        sum+=root.data;
    }
    rangesum(root.left);
    rangesum(root.right);

    return sum;

}
public static class Info2{
    int minDiff;
    int rootdata;
    public Info2(int minDiff,int rootdata){
        this.minDiff=minDiff;
        this.rootdata=rootdata;
    }
}

static Info2 ans=new Info2(Integer.MAX_VALUE, 0);

public static Info2 mindiff(Node root,int k){
    if(root==null){
        return ans;
    }

    int diffN=Math.abs(root.data-k);
    if(ans.minDiff>diffN){
        ans.minDiff=diffN;
        ans.rootdata=root.data;
    }
    mindiff(root.left, k);
    mindiff(root.right, k);

    return ans;
    
}

public static int findksmallest(Node root,int k){
    ArrayList <Integer> list=new ArrayList<>();
    inorderadd(root, list);

    return list.get(k-1);



}

public static Node bstToGst(Node root){
    ArrayList <Integer> list2=new ArrayList<>();
    ArrayList <Integer> listsum=new ArrayList<>(); 
    inorderadd(root, list2);
    int sum=0;
    for(int i=0;i<list2.size();i++){
        sum=0;
        for(int j=i;j<list2.size();j++){
            sum+=list2.get(j);
        }
        listsum.add(sum);

    }
    Node newnode=convertbst2(0, listsum.size()-1, listsum);
    return newnode;
}

 static class SumInfo{
    Boolean validbst;
    int sum;
    int maxSum;
    int max;
    int min;

    public SumInfo(Boolean validbst,int sum,int maxSum,int max,int min){
        this.validbst=validbst;
        this.sum=sum;
        this.maxSum=maxSum;
        this.max=max;
        this.min=min;
    }

}
static int maxsum=Integer.MIN_VALUE;
public static SumInfo MaxsumBST(Node root){
    if(root==null){
        return new SumInfo(true, 0,maxsum,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    SumInfo leftsum=MaxsumBST(root.left);
    SumInfo rightsum=MaxsumBST(root.right);

    int sum=root.data+leftsum.sum+rightsum.sum;
    int min=Math.min(root.data, Math.min(leftsum.min,rightsum.min));
    int max=Math.max(root.data, Math.max(leftsum.max,rightsum.max));

    if(root.data<leftsum.max || root.data>rightsum.min){
        return new SumInfo(false, sum, maxsum, max, min);
    }

     if(leftsum.validbst && rightsum.validbst){
        maxsum=Math.max(maxsum, sum);
        return new SumInfo(true, sum,maxsum,max,min);

    }

   
   

    return new SumInfo(false, sum,maxsum,max,min);

}

     
    public static void main(String args[]){
        // int values[]={8,5,3,6,10,11};
        // Node root=null;

        // for(int i=0;i<values.length;i++){
        //     root=insert(root, values[i]);
        // }
        Node root=new Node(5);
        root.left=new Node(9);
        root.left.left=new Node(6);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(7);

        root.right=new Node(2);
        root.right.right=new Node(3);
        
        // Node root2=new Node(9);
        // root2.left=new Node(3);
        // root2.right=new Node(12);
        // root.right.right=new Node(70);
        // root.right.right.left=new Node(65);
        // root.right.right.right=new Node(80);
        // inorder(root);
        // System.out.println();
        //  delete(root, 5);

        //  inorder(root);
        // printrange(root, 5, 12);
        // print_root_to_leaf(root);

        // System.out.println(isvalidbst(root, null, null));
        // preorder(root);
        //  System.out.println();
        // preorder(mirrorBST(root));

        // int arr[]={3,5,6,8,10,11,12};
        // Node newroot=creat_tree(arr, 0, arr.length-1);
        // preorder(newroot);
        // ArrayList <Integer> list=new ArrayList<>();

        // ArrayList <Integer> list2=inorderadd(root,list);
        //  Node newNode=convertbst2(0, list2.size()-1, list2);
        //  System.out.println(newNode.data);
        //  inorder(newNode);

        // largestBST(root, null, null);
        // System.out.println(maxbst);

        // Node res=mergeBST(root1, root2);
        // inorder(res);

        // System.out.println(rangesum(root));
        // Info2 newinfo=mindiff(root, 19);
        // System.out.println(newinfo.rootdata+"(Difference is "+newinfo.minDiff+")");

        // System.out.println(findksmallest(root, 3));
        // System.out.println(bstToGst(root).data);
        SumInfo inforoot=MaxsumBST(root);
        System.out.println(inforoot.maxSum);
        




        
        


        





    }
    
}
