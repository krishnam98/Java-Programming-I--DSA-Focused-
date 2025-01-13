public class substring {
    public static void main(String args[]){
        String word="helloworld";
        int startindex=0;
        int endingindex=4;

        String substring="";
        for(int i=0;i<endingindex;i++){
            substring+=word.charAt(i);

        }
        System.out.println(substring);

        System.out.print(word.substring(0,4));
    }
    
}
