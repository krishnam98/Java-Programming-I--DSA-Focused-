public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;

        }
       
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    // remove first
    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public void addLast(int data){
         Node newnode=new Node(data);
         size++;

        if(head==null){
            head=tail=newnode;
            return ;
        }
       newnode.prev=tail;
        tail.next=newnode;
        
        tail=newnode;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("no list ");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val=head.data;
            head=null;
            size=0;
            return val;
        }

        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;

        size--;
        return val;
        
    }
    public void reversedoublyll(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String args[]){
        Doublyll dll=new Doublyll();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printll();

        // dll.removeFirst();
        
    //     dll.removeLast();

    //     dll.printll();
    //    dll.addLast(5);
    //    dll.printll();

    dll.reversedoublyll();
    dll.printll();



    }

   
    
}
