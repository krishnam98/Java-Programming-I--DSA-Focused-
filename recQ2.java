public class recQ2 {
    public static void printeng(String str,int i){
        if(i==str.length()){
            return ;
        }

        if(str.charAt(i)=='0'){
            System.out.print("zero ");
        }

        if(str.charAt(i)=='1'){
            System.out.print("one ");
        }

        if(str.charAt(i)=='2'){
            System.out.print("two ");
        }

        if(str.charAt(i)=='3'){
            System.out.print("three ");
        }

        if(str.charAt(i)=='4'){
            System.out.print("four ");
        }

        if(str.charAt(i)=='5'){
            System.out.print("five ");
        }

        if(str.charAt(i)=='6'){
            System.out.print("six ");
        }

        if(str.charAt(i)=='7'){
            System.out.print("seven ");
        }

        if(str.charAt(i)=='8'){
            System.out.print("eight ");
        }

        if(str.charAt(i)=='9'){
            System.out.print("nine ");
        }

        printeng(str,i+1);
    }

    public static void main(String args[]){
        String str="1947";
        printeng(str, 0);
    }
    
}
