public class recQ3 {
public static int getlength(String str,int i){
    if(i==str.length()){
        return i;
    }

    return  getlength(str,i+1);
}

public static void main(String args[]){
    String str="123ert";
    System.out.print(getlength(str,0));

}
    
}
