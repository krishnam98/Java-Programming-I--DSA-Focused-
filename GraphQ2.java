import java.util.*;

public class GraphQ2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    static class Pair {
        Node n;
        int depth;

        public Pair(Node n,int depth){
            this.n=n;
            this.depth=depth;
        }
    }


    public static int minDepth(Node root){
        if(root==null){
            return 0;
        }
        Queue <Pair> q=new LinkedList<>();
        q.add(new Pair(root,1));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            if(curr.n.left==null && curr.n.right==null){
                return curr.depth;
            }

            if(curr.n.left!=null){
                q.add(new Pair(curr.n.left,curr.depth+1));
            }

            if(curr.n.right!=null){
                q.add(new Pair(curr.n.right,curr.depth+1));
            }
        }

        return 0;
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(8);
        root.right=new Node(2);
        root.left.left=new Node(6);
        root.left.right=new Node(5);
        root.right.left=new Node(9);

        System.out.println("Minimum Depth is: "+minDepth(root));

    }
    
}
