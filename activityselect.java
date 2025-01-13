import java.util.*;


public class activityselect {


    static class Activity{
    int start;
    int end;

    Activity(int start,int end){
        this.start=start;
        this.end=end;
    }
}

    public static void SelectActivity(ArrayList <Activity> list){
       Deque <Activity> q=new LinkedList<>();
// sorting on basis of end Time
        Collections.sort(list,(a,b)->{return a.end-b.end;});
        
        q.addLast(list.get(0));
        System.out.print("A0");
        int count =1;
        for(int i=1;i<list.size();i++){
            if(list.get(i).start>=q.peekLast().end){
                count++;
               q.addLast(list.get(i));
               System.out.print("A"+i);
            }
        }
System.out.println();
        System.out.println(count);

        

    }

    public static void main(String args[]){
        ArrayList <Activity> list=new ArrayList<>();
        list.add(new Activity(1, 2));  //A0
        list.add(new Activity(3, 4));  //A1
        list.add(new Activity(0, 6));  //A2
        list.add(new Activity(5, 7));  //A3
        list.add(new Activity(8, 9));  //A4
        list.add(new Activity(5, 9));  //A5
        SelectActivity(list);

        
    }
    
}
