// ARRAY AS A FUNCTION ARGUMENT.

import java.util.*;
public class array2 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]= {99,98,100};
      
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"  ");
        }

        update(marks);

System.out.println("******************AFTER UPDATION***********");

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+"  ");
        }


    }
}
