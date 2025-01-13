import java.time.LocalDateTime;
import java.util.*;


public class PhoneBook {
    private static class Node{
        String name;
        String phnumber;
        String gmail;
        LocalDateTime dt;
        Node next;
        Node prev;

        public Node (String name,String ph,String id,LocalDateTime dt){
            this.name=name;
            this.phnumber=ph;
            this.gmail=id;
            this.dt=dt;
            this.next=null;
            this.prev=null;
        }
        
    }

    private static Node head;
    private static Node tail;

    public static void addContact(String name,String ph,String id){
        LocalDateTime dt=LocalDateTime.now();
        Node newnode=new Node(name,ph,id,dt);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    public static void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.println();

        System.out.print("Enter Phone number: ");
        String number=sc.next();
        System.out.println();

        System.out.print("Enter Gmail ID: ");
        String id=sc.next();
        System.out.println();

        addContact(name, number, id);
        System.out.println("Contact Saved Successfully!");
    }

    public static void display(){
        Node temp=head;
        if(head==null){
            System.out.println("****************");
            System.out.println("No Contacts Saved !");
            System.out.println("****************");
            return;
        }
        while(temp!=null){
            System.out.println("****************");
            System.out.println("Name- "+temp.name);
            System.out.println("Number- "+temp.phnumber);
            System.out.println("Gmail- "+temp.gmail);
            System.out.println("Created on- "+temp.dt);
            System.out.println("****************");

            temp=temp.next;
        }
    }

    public static void delete(String key){
        Node temp=head;
        if(temp==null){
            System.out.println("PhoneBook is Empty!");
            return;
        }
        if(temp.next==null){
            if(temp.name==key){
                temp=temp.next;
            }
            return;
        }
        while(temp.next!=null){
            if(temp.next.name.equals(key)){
                Node i=temp.next;
                temp.next=i.next;
                i.next.prev=temp;
            }
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("1.Add Contact \n2.Display Contact \n3.Delete Contact \n0.To exit \nEnter Number to Perform Operations: ");
        int n=sc.nextInt();

        while(n>=1 && n<=2){

            if(n==1){
                int d=1;
                do {
                    input();
                    System.out.print("Do you want to continue adding press 1 otherwise 0");
                    d=sc.nextInt();
                    
                } while (d==1);

                System.out.print("1.Add Contact \n2.Display Contact \n3.delete contact \n0.To exit \nEnter Number to Perform Operations: ");
                n=sc.nextInt();

            }

            if(n==2){
                display();
                System.out.print("1.Add Contact \n2.Display Contact \n3.delete contact \n0.To exit \nEnter Number to Perform Operations: ");
                n=sc.nextInt();
            }
              String p=sc.nextLine();
            if(n==3){
                System.out.print("Enter Name which you want to delete: ");
                String key=sc.nextLine();
                System.out.println();
                delete(key);
                System.out.println("your contact has been deleted!");
                System.out.print("1.Add Contact \n2.Display Contact \n3.delete contact \n0.To exit \nEnter Number to Perform Operations: ");
                n=sc.nextInt();

            }

        }
    }
    
}
