public class update_ithbit {
    public static int set_ibit(int n,int i){
        int bitMask=1<<i;
        System.out.print(n|(bitMask));
        return n|(bitMask);
    }

    public static int clear_ibit(int n,int i){
        int bitMask=1<<i;
       
        return n&(~(1<<i));
    }



    public static int update_ibit(int n,int i,int newBit){
       //APPROACH 1:-
        // if(newBit==0){

        //    return clear_ibit(n, i);
        // }
        // else{
        //    return set_ibit(n, i);
        // }


    //    APPROACH 2:-
        int bitmask=newBit<<i;
        n=clear_ibit(n, i);
        return n|bitmask;




    }

    public static void main(String args[]){
        int n=10,i=2,newBit=1;
       System.out.print(update_ibit(n, i, newBit));
    }
    
}
