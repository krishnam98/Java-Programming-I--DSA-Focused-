import java.util.*;

import org.w3c.dom.Node;

public class bottomview1 {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data=data;
            this.left=left;
            this.right=right;

        }
    }
    static class Info{
        int hd;
        Node node;

        public Info(int hd,Node node){
            this.hd=hd;
            this.node=node;
            
        }
    }

    public static void getBottomview(Node root){
        Queue <Info> q=new LinkedList<>();
        HashMap <Integer,Node> map=new HashMap<>();
        q.add(new Info(0, root));
        q.add(null);
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                map.put(curr.hd, curr.node);
                if(curr.node.left!=null){
                    q.add(new Info(curr.hd-1, curr.node.left));
                    min=Math.min(min, curr.hd-1);
                }

                if(curr.node.right!=null){
                    q.add(new Info(curr.hd+1, curr.node.right));
                    max=Math.max(max, curr.hd+1);
                }
            }

        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
            
        }

    }

    public static void main(String args[]){
         Node root=new Node(20);
        root.left=new Node(8);
        root.left.left=new Node(5);
        root.left.right=new Node(3);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);

        root.right=new Node(22);
        root.right.right=new Node(25);

        getBottomview(root);


    }
    
}
