public class intern {
    public static void main(String args[]){
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        String str4=new String("abc");
        String str5=new String("abc").intern();
        if(str1==str2){
            System.out.println("true1");
        }

        if(str1==str5){
            System.out.println("true2");
        }
        
        if(str1==str4){
            System.out.println("true3");
        }

        if(str1!=str4){
            System.out.println("false");
        }
        


    }
    
}
