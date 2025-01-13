public class strcompression {
    public static String compress(String str){ //TIME COMPLEXITY = O(n);
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                count.toString();
                sb.append(count);
            }

        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str="aaaabbcccdd";
        System.out.print(compress(str));
    }
    
}
