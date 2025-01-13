public class interfac {
    public static void main(String args[]){
        king k=new king ();
        k.moves();

        queen q=new queen ();
        q.moves();
    }
}

interface chessplayer{//blueprint of chess player ie queen,king etc.
    void moves();
}
 class queen implements chessplayer{
public void moves(){
    System.out.println("queen=> up , down, left, right, diagonal (in all 4 directions)");
}
 }

 class king implements chessplayer{
    public void moves(){
        System.out.println("king=> up, down, left, right,diagonal (by 1 step)");
    }
 }
