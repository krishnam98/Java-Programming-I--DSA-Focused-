public class towerofhanoi {
public static void ToH(int n,char src,char dest,char help){
    if(n==1){
        System.out.println("shift disk "+n+" from "+src+" to "+dest);
        return;
    }
    ToH(n-1,src,help,dest);
    System.out.println("shift disk "+n+" from "+src+" to "+dest);
    ToH(n-1,help,dest,src);
}

public static void main(String args[]){
   

    ToH(3, 'A','C','B');
}
}