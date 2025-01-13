import java.util.Arrays;
public class strQ4alter {
    public static void main(String args[]){
        String str1="race";
        String str2="care";

    // converting all string into lowercase;
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();

    // converting it to character array so that we can use sor functuon;
    char [] str1chararray=str1.toCharArray();
    char [] str2chararray=str2.toCharArray();

    Arrays.sort(str1chararray);
    Arrays.sort(str2chararray);

    if(str1.length()==str2.length()){
        boolean result =Arrays.equals(str1chararray,str2chararray);
        if(result){
            System.out.print(str1 +","+ str2+" are ANAGRAM.");
        }

        else{
            System.out.print(str1 +","+ str2+" are not ANAGRAM.");
        }

    }

    else{
        System.out.print(str1 +","+ str2+" are not ANAGRAM.");

    }


    }
}
