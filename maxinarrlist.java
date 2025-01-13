import java.util.ArrayList;

public class maxinarrlist {
    public static void main(String args[]){
        Integer largest = Integer.MIN_VALUE;
        ArrayList <Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest = list.get(i);
            }
        }

        System.out.println(largest);

    }
    
}
