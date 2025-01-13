import java.util.*;

public class Linkedlist3 {
    public static class Node{
         char data;
         Node next;
        public Node (char d){
            data=d;
            next=null;
        }
    }

    public static Node head;
    public static int size;

    public  void addfirst(char data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    public static boolean ispalindrome(Node head,int size){
        Stack <Character> s=new Stack<>();
        Node temp=head;
        s.push(head.data);

        do{
            temp=temp.next;
            s.push(temp.data);
        }
        while(temp.next!=null);

        int i=0;
        while(!s.empty() && i<=(size/2)){
            if(s.peek()!=head.data){
                return false;
            }

           i++;
        }
        return true;
    }
    public static void main(String args[]){
       

        Node n1=new Node('A');
          Node n2=new Node('B');
            Node n3=new Node('C');
              Node n4=new Node('B');
                Node n5=new Node('D');
                
                n1.next=n2;
                 n2.next=n3;
                  n3.next=n4;
                   n4.next=n5;
                    n5.next=null;
                   head=n1;
                    int size=5;
                  System.out.println( ispalindrome(head, size));



        

        
        



    }
    
}
