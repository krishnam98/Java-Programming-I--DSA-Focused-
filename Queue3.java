import java.util.*;

public class Queue3 {
    static class jobs{
        char job_id;
        int deadline;
        int profit;

        jobs(char job_id,int deadline,int profit){
            this.job_id=job_id;
            this.deadline=deadline;
            this.profit=profit;

        }
    }

    public static void scheduling(ArrayList <jobs> arr){
        int slot[]=new int[arr.size()];
        ArrayList <jobs>jobs2=new ArrayList<>();
        int maxprofit=0;

    //  sortng arraylist
    // time complexity O(nlogn)
        Collections.sort(arr, (a, b) -> {return a.profit - b.profit;});
        Collections.sort(arr,Collections.reverseOrder( (a, b) -> {return a.profit - b.profit;}));

        for(int i=0;i<arr.size();i++){
            if(slot[arr.get(i).deadline]==0){
                // adding jobs with empty slot in jobs2
                jobs2.add(arr.get(i));
                maxprofit=maxprofit+arr.get(i).profit;
                slot[arr.get(i).deadline]++;
                
            }
        }

        Collections.sort(jobs2,(c,d)->{return c.deadline-d.deadline;});

        for(int j=0;j<jobs2.size();j++){
            System.out.println(jobs2.get(j).job_id);
        }



    

      
    }
    public static void main(String args[]){

        ArrayList <jobs> joblist=new ArrayList<>();
        joblist.add(new jobs('a',2,100));
        joblist.add(new jobs('b',1,19));
        joblist.add(new jobs('c',2,27));
        joblist.add(new jobs('d',1,25));
        joblist.add(new jobs('e',3,15));
        scheduling(joblist);




    }
    
}
