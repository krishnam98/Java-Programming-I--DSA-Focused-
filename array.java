import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println(marks[0]+","+marks[1]+","+marks[2]);
        System.out.println("percentage= "+(marks[0]+marks[1]+marks[2])/3 + "%");
    }
    
}
