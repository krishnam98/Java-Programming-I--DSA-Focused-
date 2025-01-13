public class tries {

    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int freq;

        public Node (){
            for(int i=0;i<26;i++){
                children[i]=null;
            }

            freq=1;
            
        }

    }
    public static Node root=new Node();
    public static int size=0;
    
    public static void insert(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=ch-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
                size++; 
                
            }
           else {curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;

    }

    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            int idx=ch-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }

        return curr.eow;
    }

    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
      for(int i=0;i<=key.length();i++){
           if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
             return true; 
            }
        }
        return false;
       
    }

    public static void prefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                char ch=(char) (i+'a');
                prefix(root.children[i],ans+ch);
            }
        }

    } 
   

    public static boolean startswith(String prefix){
        Node curr=root;
         
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            int idx=ch-'a';
            if(curr.children[idx]==null){
                return false;
            } 
            curr=curr.children[idx];
            
        }
        return true;

    }
public static String ans="";


    public static void longestWord(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
          char ch=(char)(i+'a');
          if(root.children[i]!=null && root.children[i].eow==true){
            
            temp.append(ch);
            if(ans.length()<temp.length()){
                ans=temp.toString();
                
            }
             longestWord(root.children[i], temp);
          temp.deleteCharAt(temp.length()-1);   //Backtracking step
          }
         
        }
           
    }

    static String answerD="";
    public static void longestinDictionary(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(root.children[i]!=null && root.children[i].eow){
                temp.append(ch);
                if(temp.length()>answerD.length()){
                    answerD=temp.toString();
                }
                longestinDictionary(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);  //backtracking step
            }
        }
    }

    public static void main(String args[]){
      String arr[]={"w","wo","words","worl","world"};
        // String key="ilikesamsung";

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        // System.out.println(search("the"));
        // System.out.println(search("thor"));

        // System.out.println(wordbreak(key));
        // root.freq=-1;
        // String ans="";
        // prefix(root, ans);
        // String prefix="app";
        // System.out.println(startswith(prefix));
        // System.out.println(size);
        StringBuilder temp=new StringBuilder("");
        // longestWord(root,temp);
        // System.out.println(ans);

        longestinDictionary(root,temp);
        System.out.println(answerD);
  
    }
    
}
