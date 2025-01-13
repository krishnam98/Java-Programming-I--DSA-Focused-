public class queueDS {
    static class Queue{
       static int arr[];
       static int size;
       static int rear;
       static int front;

     Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;

       }

       public static boolean isempty(){
        if(rear==-1 && front==-1){
            return true;
        }
        return false;
       }      
        public static boolean isfull(){
            if((rear+1)%size ==front){
                return true;
            }
            return false;
        }

    //    add 

    public static void add(int data){
        if(isfull()){
            System.out.println("queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }

        rear=(rear+1)%size;
        arr[rear]=data;
    }
// remove
    public static int remove(){
        if(isempty()){
            System.out.println("Queue if full");
            return -1;
        }

        int result=arr[front];
       
     if(rear==front){
        rear=front=-1;
        return result;
     }

     front=(front+1)%size;
     return result;
    }
    // peek

    public static int peek(){
        if(isempty()){
            System.out.println("queue is empty");
         return -1;
        }
        return arr[0];

    }


    }
    public static void main (String args[]){
        Queue Q1=new Queue(3);
        Q1.add(1);
        Q1.add(2);
        Q1.add(3);
        System.out.println(Q1.remove());   //prints front(int this case it is '1')
        Q1.add(4);
        System.out.println(Q1.remove());  //front shifts to '2', therby printing '2'.
        Q1.add(5);

    
        while(!Q1.isempty()){
            System.out.println(Q1.remove()+" ");
        }


        



    }
}
