import java.util.*;

public class BT {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class info{
        int d;
        int h;

        info(int d,int h){
            this.d=d;
            this.h=h;
        }
    }

    static class Info5{
        int use;
        int max;

        Info5(int use,int max){
            this.use=use;
            this.max=max;
        }

    }

    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);

            // connecting Nodes
            return newnode;
        }

        static int idx2=-1;
        public static Node buildtree2(int nodes[]){
            idx2++;
            if(nodes[idx2]==-1){
                return null;
            }

            Node newnode=new Node(nodes[idx2]);
            newnode.left=buildtree2(nodes);
            newnode.right=buildtree2(nodes);

            // connecting Nodes
            return newnode;
        }

        // TIME COMPLEXITY=> O(n)
        public static void preorder(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        // TIME COMPLEXITY=> O(n)
        public static void inorder(Node root){
            if(root==null){
                return;
            }

            inorder(root.left);  //left subtree
            System.out.print(root.data+" "); //root
            inorder(root.right);  //right subtree
        }

        // TIME COMPLEXITY=>O(n)
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left); 
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node root){
            Queue <Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                 
               Node currNode=q.remove();
               if(currNode==null){    //shows level is completed and all next nodes are stored
                System.out.println();
                if(q.isEmpty()){       // no next node shows tree is ended after level completion
                    break;
                }
                else{
                    q.add(null);       //all the next node of next level is add from current level so add null to show level completion of next level 
                }
               }
               else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
               }
            }

        }
        // TIME COMPLEXITY=> O(n)
        public static int height(Node root){
            if(root==null){
                return 0;
            }

            int lh=height(root.left);
            int rh=height(root.right);

            int heightN=Math.max(lh, rh)+1; 
            return heightN;              
        }
        // TIME COMPLEXITY=> O(n)
        public static int countnode(Node root){

            // base case
            if(root==null){
                return 0;
            }
            int countLeft=countnode(root.left);
            int countright=countnode(root.right);

            return countLeft+countright+1;
        }
        // TIME COMPLEXITY=> O(n)
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int sumL=sum(root.left);
            int sumR=sum(root.right);

            return sumL+sumR+root.data;
        }

        // TIME COMPLEXITY=> O(n^2)
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            int ld=diameter(root.left);
            int rd=diameter(root.right);
            int lh=height(root.left);
            int rh=height(root.right);

            int sd=lh+rh+1;

            return Math.max(sd,Math.max(ld,rd));
        }

        // TIME COMPLEXITY=> O(n)
        public static info diameterf(Node root){

            if(root==null){
                return new info(0,0);
            }

            info linfo=diameterf(root.left);
            info rinfo=diameterf(root.right);
            int sd=linfo.h+rinfo.h+1;
            int df=Math.max(Math.max(linfo.d,rinfo.d),sd); //calculating diameter

            int hf=Math.max(linfo.h,rinfo.h)+1;  //calculating height

            return new info(df,hf);
        }
        //  function to check if tree is identical to subtree
        public static Boolean isidentical(Node root,Node subroot){
            if(root==null && subroot==null){
                return true;
            }
            else if(root==null || subroot==null || subroot.data!=root.data){
                return false;
            }
            if(!isidentical(root.left, subroot.left)){
                return false;
            }

             if(!isidentical(root.right, subroot.right)){
                return false;
            }
            return true;
            

        }
        //  function to search NODE which is equal to SUBNODE
        public static Boolean searchsubroot(Node root,Node subroot){
            if(root==null){
                return false;
            }

            if(root.data==subroot.data){
                if(isidentical(root,subroot)){
                    return true;
                }
            }

            return searchsubroot(root.left, subroot) || searchsubroot(root.right,subroot);

        }

        static class info1{
            int hd;
            Node node;

            info1(int hd,Node node){
                this.hd=hd;
                this.node=node;
            }
        }

        public static void topview(Node root){
            Queue<info1> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0;int max=0;
            q.add(new info1(0, root));
            q.add(null);

            while(!q.isEmpty()){
                info1 curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }

                else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd,curr.node);
                    }

                    if(curr.node.left!=null){
                        q.add(new info1(curr.hd-1, curr.node.left));
                        min=Math.min(min, curr.hd-1);
                    }

                    if(curr.node.right!=null){
                        q.add(new info1(curr.hd+1, curr.node.right));
                        max=Math.max(max,curr.hd+1);
                    }
                }
            }

            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }

        }
        
        public static void Kthlevel(Node root,int level,int k){
            if(root==null){
                // System.out.println("Level doesn't exist!");
                return;
            }

            if(level==k){
                System.out.print(root.data+" ");
                return;
            }

            Kthlevel(root.left,level+1,k);
            Kthlevel(root.right, level+1, k);

        }

        public static Boolean getpath(ArrayList <Node> path,Node root,int n){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }

            Boolean leftfound=getpath(path, root.left, n);
            Boolean rightfound=getpath(path, root.right, n);
            if(leftfound||rightfound){
                return true;
            }
            path.remove(path.size()-1);
            return false;


        }
        public static Node lca(Node root,int n1,int n2){
            ArrayList <Node> path1=new ArrayList<>();
            ArrayList <Node> path2=new ArrayList<>();

            getpath(path1,root,n1);
            getpath(path2,root,n2);
            int i=0;
            for(;i<path1.size()&&i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }

            return path1.get(i-1);

        }
        public static Node lca2(Node root, int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }

            Node leftn=lca2(root.left, n1, n2);
            Node righnt=lca2(root.right, n1, n2);

            if(leftn==null){
                return righnt;

            }
            if(righnt==null){
                return leftn;
            }
            return root;

        }

        public static int lcadist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }

            int leftdist=lcadist(root.left, n);
            int rightdist=lcadist(root.right, n);

            if(leftdist==-1 && rightdist==-1){
                return -1;

            }
            if(leftdist==-1){
                return rightdist+1;
            }
           
                
            else{
                    return leftdist+1;
                }
            

        }
        public static int mindist(Node root,int n1, int n2){
            Node lca=lca2(root, n1, n2);
            int distance1=lcadist(lca,n1);
            int distance2=lcadist(lca, n2);

            return distance1+distance2;
            
            
        }

        public static int kancestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }

            int leftn=kancestor(root.left, n, k);
            int rightn=kancestor(root.right, n, k);
            if(leftn==-1 && rightn==-1){
                return -1;
            }

            // else if(leftn==-1){
            //     if(rightn+1==k){
            //        System.out.print(root.data);
            //        return -1;
            //     }
            //     else{
            //         return rightn+1;
            //     }
            // }

            //     else{ 
            //         if(leftn+1==k){
            //         System.out.print(root.data);
            //         return -1;
            //         }
            //         else{
            //             return leftn+1;
            //         }
            //     }   
            
            int max=Math.max(leftn, rightn);
            if(max+1==k){
                System.out.println(root.data);
            }
               return max+1;   //<=leftn+1 or roghtn+1
           
        }

        public static int sumtree(Node root){
           if(root==null){
            return 0;
           }

           int next=root.data;
           root.data=sumtree(root.left)+sumtree(root.right);

           return root.data+next;
        }

        public static Boolean univalue(Node root){
            if(root.left==null && root.right==null){
                return true;
            }
            Boolean decision=true;
            if(root.left.data!=root.right.data || root.data!=root.left.data || root.data!=root.right.data){
                decision=false;
                return decision;
            }
            if(decision){
                decision=univalue(root.left);
                
            }

            if(decision){
                decision=univalue(root.right);
            }

            return decision;
        }
        public static Boolean mirrortree(Node root1,Node root2){
            if((root1.left==null && root2.right==null) || (root1.right==null&&root2.left==null)){
                return true;
            }

            Boolean decision=true;

            if(root1.left.data!=root2.right.data || root1.right.data!=root2.left.data){
                decision=false;
                return decision;

            }
            if(decision){
                decision=mirrortree(root1.left, root2.right);
            }

            if(decision){
                decision=mirrortree(root1.right, root2.left);

            }

            return decision;
        }

        public static Node deleteleaf(Node root,int x){
            if(root==null){
                return null;
            }

            if(root.data==x && root.left==null && root.right==null){
                
                return null;
            }

            root.left=deleteleaf(root.left, x);
            root.right=deleteleaf(root.right, x);
            return root;

            
        }
        public static String inordernew(Node root,HashMap <String,Integer> map){
            if(root==null){
                return "";
            }

            String str="(";
            str+=inordernew(root.left,map);
            str+=Integer.toString(root.data);
            str+=inordernew(root.right,map);
            str+=")";

            if(map.get(str)!=null && map.get(str)==1){
                System.out.print(root.data+" ");
            }

            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }

            else{
                map.put(str,1);
            }

            return str;
        }

        public static void printalldup(Node root){
            HashMap <String,Integer> map=new HashMap<>();
            inordernew(root, map);
            
        }

        public static int inordernew2(Node root,HashMap<String,Integer> map, ArrayList<Integer>list){
           
            
            if(root==null){
                return 0;
            }
            String triplet="";
            triplet+=Integer.toString(inordernew2(root.left, map,list));
            triplet+=Integer.toString(root.data);
            triplet+=Integer.toString(inordernew2(root.right, map,list));

            // if(map.get(triplet)!=null && map.get(triplet)==1){
            //     System.out.print(root.data+" ");

            // }

            // if(map.containsKey(triplet)){
            //     map.put(triplet, map.get(triplet)+1);
            // }

            // else{
            //     map.put(triplet,map.size()+1);
            // }

           

            if(map.containsKey(triplet)){
                // map.put(triplet, map.get(triplet)+1);
                if(!list.contains(root.data)){
                    list.add(root.data);
                    System.out.print(root.data+" ");
                }
            }

            else{
                map.put(triplet,map.size()+1);
            }

            int id=map.get(triplet);

            return id;




        }

        public static void printdup1(Node root){
            HashMap<String,Integer> map=new HashMap<>();
             ArrayList<Integer>list=new ArrayList<>();
            inordernew2(root, map,list);
        }


          
      public static Info5 helper(Node root,Info5 info){
            if(root==null){
                return new Info5(0,0);
            }

            int sum=0;
           int lefts=helper(root.left,info).use;
            sum+=lefts;
            sum+=root.data;

            int rights=helper(root.right,info).use;
            sum+=rights;
           int max_single=Math.max(Math.max(lefts+root.data, rights+root.data),root.data);
            info.max=Math.max(Math.max(max_single,sum),info.max);

            return new Info5(Math.max(Math.max(lefts+root.data, rights+root.data),root.data),info.max);
        }

        public static void maxpathsum(Node root){
            Info5 info=new Info5(0,0);
            
            System.out.println(helper(root, info).max);
           
        }


        



        
    }

    public static void main(String args[]){
        int nodes[]={-10,9,-1,-1,20,15,-1,-1,7,-1,-1};
       Binarytree tree=new Binarytree();
       int subNodes[]={1,3,7,-1,-1,6,-1,-1,2,5,-1,-1,4,-1,-1};
        Node root=tree.buildtree(nodes);
        Node subroot=tree.buildtree2(subNodes);
        //  System.out.println(subroot.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        //  tree.levelorder(subroot);
        // System.out.println(tree.height(root));
        // System.out.println(tree.countnode(root));
        // System.out.println(tree.sum(root));
        // System.out.println(tree.diameter(root));
        // System.out.println("DIAMETER OF TREE: "+tree.diameterf(root).d+", HEIGHT OF TREE: "+tree.diameterf(root).h);
        //  System.out.println(tree.searchsubroot(root, subroot));
        // tree.topview(root);
        // tree.Kthlevel(root,1,3);
        // System.out.println(tree.lca(root, 4, 6).data);
        // System.out.println(tree.lca2(root, 4, 5).data);
        // System.out.println(tree.mindist(root, 4, 5));
        // tree.kancestor(root, 6, 1);
        // tree.sumtree(root);
        //  tree.levelorder(subroot);
        // System.out.println(tree.univalue(subroot));
        // System.out.println(tree.mirrortree(root, subroot));
        // tree.deleteleaf(root, 3);
        // tree.levelorder(root);
        // tree.printalldup(root);
        // tree.printdup1(root);
        tree.maxpathsum(root);


    } 
    
}
