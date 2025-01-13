public class removingduplicate {
    public static void removeduplicate(String str,int i,StringBuilder newstr,boolean map[]){
        if(i==str.length()){
            System.out.print(newstr);
            return;
        }

        char currentchar=str.charAt(i);

        if(map[currentchar-'a']==true){
           removeduplicate(str, i+1, newstr, map);
        }
        else{
            map[currentchar-'a']=true;
            removeduplicate(str, i+1, newstr.append(currentchar), map);
        }
    }

    public static void main(String args[]){
        String str="kkkkrrrriiiishhhnnnnammmmmmm";
        removeduplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
    
}
