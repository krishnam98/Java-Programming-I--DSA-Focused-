public class strQ1 {
    public static int countLVowels(String str){ // time complexity=O(n) where n is length of string;
      int count=0;
       for(int j=0;j<str.length();j++){
           if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'){
             count++;
            }
        }
        return count;

    }

    public static void main(String args[]){
        String str="hEllo worlde";
        System.out.print("Number of lower case vowels are = " +countLVowels(str));
    }

    
    
}
