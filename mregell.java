import java.util.*;

public class mregell {
    static class Node implements Comparable<Node>{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

        public int compareTo(Node n2){
            return this.data-n2.data;
        }

        
    }

    public static void mergell(Node arr[],int k){
            PriorityQueue <Node> pq=new PriorityQueue<>();

            Node head=new Node(-1);
            Node temp=head;
            for(int i=0;i<k;i++){

                if(arr[i]!=null){
                 pq.add(arr[i]);
                }
                

            }

            if(pq.isEmpty()){
                System.out.println("Null");

            }

            while(!pq.isEmpty()){
                Node curr=pq.remove();
                temp.next=curr;
                temp=temp.next;
                if(curr.next!=null){
                    pq.add(curr.next);
                }
            }
             Node temp2=head.next;
            while(temp2!=null){
                System.out.print(temp2.data+"->");
                temp2=temp2.next;

            }
            if(temp2==null){
                System.out.println("null");
            }
        }

    public static void main(String args[]){
        int k=3;
        Node arr[]=new Node[k];

        Node head1=new Node(1);
        arr[0]=head1;
        head1.next=new Node(3);
        head1.next.next=new Node(7);

        Node head2=new Node(2);
        arr[1]=head2;
        head2.next=new Node(4);
        head2.next.next=new Node(8);

        Node head3=new Node(9);
        arr[2]=head3;
        head3.next=new Node(10);
        head3.next.next=new Node(11);
        mergell(arr, k);
         
        




    }

    
        
        
        

    
    
}
