import java.util.*;

public class groupanagram {
    public static class Node{
        ArrayList <String> data;
        Node children [];
        boolean eow;

        public Node (){
            data=new ArrayList<>();
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();

    public static void insert(String str){
        char word[]=str.toCharArray();
        Arrays.sort(word);
        Node curr=root;
        for (char c : word) {
            int idx=c-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];

        }
        curr.eow=true;
        curr.data.add(str);

    }
    static ArrayList<ArrayList<String>> list=new ArrayList<>();
    public static void GroupAnagrams(Node root){
        if(root.eow){
           list.add(root.data);
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
               GroupAnagrams(root.children[i]);
            }

        }
    }
    public static void main(String args[]){
        String str[]={"eat","tea","tan","ate","nat","bat"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
        GroupAnagrams(root);
        System.out.println(list);

    }
    
}
