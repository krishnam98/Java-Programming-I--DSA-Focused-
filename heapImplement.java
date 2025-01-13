import java.util.*;

public class heapImplement {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            // add last
            arr.add(data);

            int x=arr.size()-1; // idx of child
            int par=(x-1)/2;
           
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
            }

        }

        public int peek(){
            if(arr.size()!=0){
                return arr.get(0);
            }

            else{
                return -1;
            }
            
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;

            if(left<arr.size() && arr.get(left)<arr.get(minidx)){
                minidx=left;
               
            }

            if(right<arr.size() && arr.get(right)<arr.get(mini dx)){
                minidx=right;
                
            }

            if(minidx!=i){
                int temp=arr.get(minidx);
                arr.set(minidx,arr.get(i));
                arr.set(i,temp);
                 heapify(minidx);
            }
           

        }

        public int remove(){
            // swapping first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //  removing last 
            arr.remove(arr.size()-1);

            // HEAPIFY
            heapify(0);
            return temp;
        }

        public Boolean isempty(){
            return arr.size()==0;
        }

       
    }

    public static void main(String args[]){
        Heap h1=new Heap();
        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(10);
        h1.add(5);
        // int i=0;
        // System.out.println("initial list:-");
        // while(i<5){
        //     System.out.print(h1.arr.get(i)+" ");
        //     i++;
        // }

        // System.out.println();

        // h1.add(1);
        // int j=0;
        //  System.out.println("Final list:-");
        // while(j<6){
        //     System.out.print(h1.arr.get(j)+" ");
        //     j++;
        // }

        // System.out.println(h1.peek());
        while(!h1.isempty()){
            System.out.println(h1.peek());
            h1.remove();
        }





    }
    
}
