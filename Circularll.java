public class Circularll {
    public class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
        }

    }

    public static Node last;

    public void addinempty(int data){
       Node newnode=new Node (data);
      
      last=newnode;
      newnode.next=last;

    }
    public void addfirst(int data){
        if(last==null){
            addinempty(data);
            return;
        }

        Node newnode=new Node(data);
        newnode.next=last.next;
        last.next=newnode;

    }
    public void addlast(int data){
        if(last==null){
            addinempty(data);
        }
        Node newnode=new Node(data);
        newnode.next=last.next;
        last.next=newnode;
        last=newnode;
    }

    public void addmiddle(int data ,int data2){
        Node newnode=new Node(data);

        Node temp=last.next;
        do{
            if(temp.data==data2){
                newnode.next=temp.next;
                temp.next=newnode;
                return;
            }
            temp=temp.next;

        }
        while(temp!=last.next);
        System.out.println(data2+"- node is not present,please enter a valid node.");

    }

    public void printcycle(){
        Node temp=last.next;
        do{
          System.out.print(temp.data+"->");
          temp=temp.next;
        
        }
        while(temp!=last.next);
        System.out.println(last.next.data+"*");
        
    }

   
    public int removeLast(){
         if(last.next==last){
            last=null;
            return Integer.MIN_VALUE;
        }

        Node temp=last.next;
        do{
            temp=temp.next;
        }
        while(temp.next!=last);

        int val=last.data;
        temp.next=last.next;
        last=temp;
        return val;
    }

    public int removemid(int key){
         if(last.next==last){
            last=null;
            return Integer.MIN_VALUE;
        }

        if(key==last.data){
            removeLast();
        }
        
        Node temp=last.next;
        do{
            if(temp.data==key){
                int val=temp.next.data;
                temp.next=temp.next.next;
                return val;
            }
            temp=temp.next;
        }
        while(temp!=last.next);
        System.out.println("key not found,please enter valid data ");

    }





    public static void main (String args[]){
        Circularll cyll=new Circularll();
        cyll.addinempty(2);
        
        cyll.addfirst(1);
        
        cyll.addlast(4);
       
        cyll.addmiddle(3,2);  
        cyll.printcycle();
        System.out.println("new list :-");
        cyll.removeLast();
        cyll.printcycle();



    }

   
}
    

