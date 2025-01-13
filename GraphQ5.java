import java.util.*;
public class GraphQ5 {
    static class Info{
        String word;
        boolean vis;

        public Info(String word){
            this.word=word;
        }
    }

    public static int findchain(String start,String target,HashSet<String> hs){
        Queue <String> q=new LinkedList<>();
        if(start==target){
            return 0;
        }

        if(!hs.contains(target)){
            return 0;
        }

        q.add(start);
        int level=0;
        int wordlnt=start.length();

        while(!q.isEmpty()){
            ++level;
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                char word[]=q.remove().toCharArray();
                for(int j=0;j<wordlnt;j++){
                    char origchar=word[j];
                    for(char ch='a';ch<='z';ch++){
                        word[j]=ch;
                        if(String.valueOf(word).equals(target)){
                            return level+1;
                        }
                        if(!hs.contains(String.valueOf(word))){
                            continue;
                        }

                        if(hs.contains(String.valueOf(word))){
                            q.add(String.valueOf(word));
                            hs.remove(String.valueOf(word));
                        }

                    }
                    word[j]=origchar;
                }
            }

        }
        return 0;

       

    }

    public static void main(String args[]){
        String dictionary[]={"poon","plee","same","poie","plea","plie","poin"};
        HashSet <String> hs=new HashSet<>();
        for(int i=0;i<dictionary.length;i++){
            hs.add(dictionary[i]);
        }

        System.out.println(findchain("toon", "plea",hs));
        
    }

    
}
