public class subset {
    public static void findsubset(String arr,String ans,int i){
        if(i==arr.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }

        // if character says YES 
        findsubset(arr,ans+arr.charAt(i),i+1);
        // if character says NO
        findsubset(arr,ans,i+1);
    }

    public static void main(String args[]){
        String arr="abc";
        findsubset(arr,"", 0);
    }
    
}
