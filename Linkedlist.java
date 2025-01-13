public class Linkedlist {
    public static class Node{
        int data;
        Node next;  // node class ka object

        public Node(int data){   //parameterised constructor
            this.data=data;
            this.next= null;
        }

        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int n){
        
        // step1: Creating a node
        Node newnode= new Node(n);
        size++;

        if(head==null){   //when head points null i.e. when there is no node
        head=tail=newnode;
        return;
        }

        //  newnode ke next mein head ki value
        newnode.next=head;

        // head mein newnode ki value daaldi  
        head=newnode;
    }

    public void addlast(int n){
        // step1: create a node
        Node newnode =new Node(n);
        size++; 

        if(head==null){   //when there is no node present
            head=tail=newnode;
        }

        //step2: tail's next=newnode
        tail.next=newnode;

        // step3: storing value of newnode in tail to make newnode as tail
        tail=newnode;

    }

    public void printlist(){
        if(head==null){
            System.out.println("LIST IS EMPTY!");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }

        System.out.println("null");
    }

    public void addmiddle(int index,int n){
        
        if(head==null){
            addfirst(n);
            return;
        }

        Node newnode=new Node(n);
        size++;

        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newnode.next=temp.next;
        temp.next=newnode;
    }
    //   time complexity => O(n)
    // public int size(){
    //     Node temp=head;
    //     int count=0;
    //     while(temp!=null){
    //         temp=temp.next;
    //         count++;
    //     }
    //     return count;
    // } 

    public int removefirst(){
        if(size==0){
            System.out.println("list is empty!");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val =head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
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
// TIME COMPLEXITY => O(n)
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }

        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){    //traverse karte karte head null par aa jaye ya list hi na bani ho
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next,key);

        if(idx!=-1){
            return idx+1;
        }
        return -1;
    }
// TIME COMPLEXITY => O(n) due to helper function
    public int recsearch(int key){
        return helper(head,key);
    }

    // TIME COMPLEXITY => O(n)
    // 3 VARIABLE 4 STEP PROCESS 
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;   //reversing step
            prev=curr;        //updating prev,curr,next to reverse other nodes next to cuurent node 
            curr=next;
           
        }
        head=prev; // when curr is null prev is last element and making it as head makes the last element as first
    }

    public void deleteNthfromend(int n){
        // calculating size
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++; 
        }

        if(n==size){
            head=head.next;
            return;
        }

        int i=1;
        int idxtofind=size-n;
        Node prev=head;
        while(i<idxtofind){
            prev=prev.next;
            i++;
        }
        // Node bin=prev.next;
       // prev.next=bin.next;

      // or

        prev.next=prev.next.next;
    }
// Slow Fast concept
    public Node midnode(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;  //midnode
    }
    public boolean ispalindrome(){
        // corner case
       if(head==null || head.next==null){
        return true;

       }
        // step-1 find mid
        Node mid=midnode();

        // step-2 reversing 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        // now prev is the last node



        //Step-2 checking 1st half = 2nd half
        Node left=head;
        Node right=prev;
         while(left.next!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
         }
         return true;
    }
//    SLOW AND FAST POINTER APPROACH
    public boolean cycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;    //cycle exist
            }
        }
         return false;         // cycle does not exist
    }

    public void removecycle(){
    //    detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!= null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break; //ends a loop
        }
    }

    if(cycle==false){
        return ;
    }

    // Find the meeting point & last node

    slow = head;
    Node prev=null;
    while(slow!=fast){
        slow=slow.next;
        prev=fast;
        fast=fast.next;

    }
    // prev is last node

    // lastnode.next = null 
    prev.next=null;
   
    }
    // Getmid function
    public Node Getmid(Node head){
        Node slow= head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;   //mid value
    }
// merge function
    public Node merge(Node head1,Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;
        while(head1!=null && head2!=null){
            if(head1.data <head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }

            else{
                temp.next= head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }

            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }

            return (mergell.next);


        
          }

    public Node mergeSort(Node head){
        // base case
        if(head==null || head.next== null){
            return head;
        }

        // step 1 find mid
        Node mid= Getmid(head);

        // step 2 divide 
        Node righthead=mid.next;
        mid.next=null;
        Node left= mergeSort(head);   //left part 
        Node right=mergeSort(righthead);

        //  step 3 merge both parts
        return merge(left,right);
    }

       

    //    find middle node

    private Node getmid(){
        Node slow = head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        return slow;

    }

  

    public void zigzag(){
         if(head==null || head.next==null){
            return ;
        }
// Step 1 get middle node
        Node mid= getmid();
        Node righth=mid.next;
        mid.next=null;
// Step 2 reversing 2nd half
        Node prev=null;
        Node curr=righth;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev; 

            prev=curr;
            curr=next;
        } 
// Step 3 connecting nodes
        Node temp1=head;
        Node temp2=prev;
        Node bin1; // nextleft 
        Node bin2;   //nextright
        while(temp1!=null && temp2!=null){
            bin1=temp1.next;
            bin2=temp2.next;

            temp1.next=temp2;
            temp2.next=bin1;

            temp1=bin1;  //updating temp1
            temp2=bin2;  //updating temp2
            
        }


    }


    




 public static void main(String args[]){
   Linkedlist ll=new Linkedlist();


   ll.addfirst(5);

   
   ll.addfirst(4);


   ll.addfirst(3);

   
   ll.addfirst(2);

   
   ll.addfirst(1);

     
      
   ll.printlist();
//    System.out.println("new list:- ");
   
//    ll.addmiddle(2,5); 
//    ll.printlist();
//    System.out.println("size of list= "+size);
// ll.removefirst();
// ll.printlist(); 

// ll.removelast();
// ll.printlist();
   
 //   System.out.println( ll.itrsearch(4));

// System.out.println(ll.recsearch(5));

// System.out.println("reversed list:-");

// ll.reverse();
// ll.deleten(2);

// ll.printlist();

// System.out.println(ll.ispalindrome());

// head =4
// ll.head= ll.mergeSort(ll.head);
// now head is = 1
// System.out.println("sorted list:-");
// ll.printlist();
// System.out.println("Zig-Zag List:-");
// ll.zigzag();
// ll.printlist();

        
    }



    
    

    
}
