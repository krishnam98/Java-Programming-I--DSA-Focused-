import java.util.ArrayList;
public class ArraylistDS {
    public static void main(String args[]){
        ArrayList<Integer>list1=new ArrayList<>();
        // add function    TC=>0(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        // get function   TC=>0(1)
        int element = list1.get(2);
        System.out.println(element);


        //  remove function  TC=>0(n)

        // list1.remove(2);
        // System.out.println(list1);


        // set function  TC=>0(n)

        // list1.set(2,10);
        // System.out.println(list1);

        // contains function  TC=>0(n)

        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(100));

        // special add function    TC=>0(n)

        // list1.add(1,9);
        // System.out.println(list1);

        // .size function

        System.out.println(list1.size());




    }
    
}
