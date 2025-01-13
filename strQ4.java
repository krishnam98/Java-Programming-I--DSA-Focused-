public class strQ4 {
    public static int findAnagram(String str1,String str2){
        int count =0;
       if(str1.length()==str2.length()){
           for(int i=0;i<str1.length();i++){
               for(int j=0;j<str2.length();j++){
                   if(str1.charAt(i)==str2.charAt(j)){
                     count++;
                    }

                }

            }
        }
        return count;
    }
    public static void main(String args[]){
        String str1="care";
        String str2="care";
        int count=findAnagram(str1, str2);
        if(count==str1.length()){
            System.out.print("anagram");
        }
        else{System.out.print("not an anagram");
    }


    }
    
}
