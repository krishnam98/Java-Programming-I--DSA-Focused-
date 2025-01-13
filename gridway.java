public class gridway {
    public static int grids(int i, int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }

        else if(i==n || j==m){
            return 0;
        }

        int w1=grids(i+1,j,n,m); //down
        int w2=grids(i,j+1,n,m); // right

        return w1+w2;
    }
    public static void main(String args[]){
        int n=4;
        int m=4;
        System.out.print(grids(0, 0, n, m));
    }




    
}
