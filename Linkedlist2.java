import java.util.ArrayList;
import java.util.LinkedList;
public class Linkedlist2 {
    public  class Node{
        int data;
        Node next;
       
        public Node(int data){
            this.data=data;
            this.next=null;
           

        }
    }
    public  Node head;
    public  Node tail;
    public  int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;
    }
    // public int size(Node head){
    //     Node temp=head;
    //     int count;
    //     while(temp!=null){
    //         temp=temp.next;
    //         count++;

    //     }
    //     return count;
    // }
    
    // TIME COMPLEXITY=> O(n*m)
    public static int intersection(Node head1,Node head2){
        Node temp1=head1; 
        Node temp2;
        
        while(temp1!=null){
             temp2=head2;
            while(temp2!=null){
                if(temp1.data==temp2.data){
                    return temp1.data;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return -1;

       
    }

    public void deleteNafterM(int m,int n){
        // move through m node
        Node temp=head;
     while(temp!=null){
        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        // removing n nodes and connecting last node travelled with (n+1)th node
        Node remove=temp.next;
        for(int j=0;j<n;j++){
            temp.next=remove.next;
            remove=remove.next;
            if(remove==null){
                return ;
            }
        }
        // updating temp

        temp=temp.next;
      }

    }

    public  void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public void swapNodes(int x,int y){
        if(x==y){
            return;
        }
        Node prevx= null;
        Node currx=head;
        while(currx!=null && currx.data!=x){
            prevx=currx;
            currx=currx.next;
        }

        Node prevy=null;
        Node curry=head;
        while(curry!=null && curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }

        if(currx==null || curry==null){
            return;
        }
        
        if(prevx!=null){
            prevx.next=curry;
        }
        else{
            head=curry;
        }

        if(prevy!=null){
            prevy.next=currx;
        }
        else{
            head=currx;
        }

        Node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;
    }

    public void oddeven(){
        // creation of pointers
        Node temp=head;
        Node even;
        Node next;
        if(head.data%2==0){
            even=head;
        }
        else{
            even=null;
        }

        while(temp!=null){
            next=temp.next;
            if(temp.data%2!=0){
               
                if(temp.next.data%2==0){
                    even.next=next;
                    temp.next=next.next;
                    next.next=temp;
                    even=next;
                    
                 
                    
                }
               
            }

            temp=temp.next;
            if(temp!=null){
                if(temp.data%2==0){
                    even=temp;
                }
            }

           
        }


    }

    public  Node mergesort(Node a,Node b){
      Node result=new Node(-1);
        Node temp=result;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                temp.next=a;
                a=a.next;
                temp=temp.next;
            }

            else{
                temp.next=b;
                b=b.next;
                temp=temp.next;
            }
        }

        while(a!=null){
            temp.next=a;
            a=a.next;
            temp=temp.next;
        }

        while(b!=null){
            temp.next=b;
            b=b.next;
            temp=temp.next;
        }
        return result.next;
    }

    public  Node mergeklist(Node arr[],int last){
        while(last!=0){
            int i=0; int j=last;
            while(i<j){
                arr[i]=mergesort(arr[i],arr[j]);
                i++;
                j--;

                 if(i>=j){
                  last=j;
                  }
            }
           
            
        }
        return arr[0];
    }

    public static void main(String args[]){
        Linkedlist2 ll=new Linkedlist2();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
             Linkedlist2 ll2=new Linkedlist2();
             ll2.addFirst(9);
             ll2.addFirst(8);
             ll2.addFirst(7);


                     Linkedlist2 ll3=new Linkedlist2();
                     ll3.addFirst(6);
                     ll3.addFirst(5);
                     ll3.addFirst(4);

        int n=3;
        int k=3;
        
   Node arr[]=new Node[k];
   arr[0]=ll.head;
   arr[1]=ll2.head;
   arr[2]=ll3.head;

   


       ll.head=ll.mergeklist(arr, k-1);




        ll.printlist();

        

        
       
      
     



       


        
        
    }
    
}
