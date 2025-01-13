import java.util.*;
public class Bottomveiwoftree{
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    
        
    }

   static int min=Integer.MAX_VALUE;
   static int max=Integer.MIN_VALUE;
   static HashMap <Integer,Integer> map=new HashMap<>();

    public static void bottomview(Node root,int x){
        if(root==null){
            return ;
        }
        bottomview(root.left, x-1);
        bottomview(root.right, x+1);
        if(!map.containsKey(x)){
            map.put(x, root.data);
            min=Math.min(min, x);
            max=Math.max(max, x);
        }
       
    }
    public static void printmap(HashMap <Integer,Integer> map,int min,int max){
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i)+" ");
        }
    }
    public static void showBottom(Node root){
        bottomview(root, 0);
        printmap(map, min, max);
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

        showBottom(root);

        

    }
}