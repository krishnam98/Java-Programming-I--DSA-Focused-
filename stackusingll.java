public class stackusingll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{
        static Node head=null;

        public static Boolean isempty(){
            return head==null;
        }

        // push
        public static void push(int data){
            Node newnode = new Node (data);
            if(isempty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }

        // pop
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(isempty()){
                return -1;
            }

            int top=head.data;
            return top;
        }

    }

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
