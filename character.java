public class character {
    public static void main(String args[]){
        char ch='A';
        for(int line=1;line<=10;line++){
            for(int s=1;s<=line;s++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
    
}
