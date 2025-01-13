import java.util.*;

public class greedyQ1 {
    public static void main(String args[]){
        String str="LRLLRRLRRL";
        int Lcount=0;
        int Rcount=0;
        int strcount=0;

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);

            if(curr=='L'){
                Lcount++;
            }
            else{
                Rcount++;
            }

            if(Lcount==Rcount){
                strcount++;
                Lcount=0;
                Rcount=0;
            }
        }

        System.out.println("Maximum number of balanced substrings= "+strcount);

    }
    
}
