public class floodfill {
    public static void floodfillhelper(int img[][],int sr,int sc,int color,int origval,boolean vis[][]){
        if(sr<0 || sc<0 || sr>=img.length || sc>=img[0].length || vis[sr][sc] || img[sr][sc]!=origval){
            return;
        }
        img[sr][sc]=color;
        floodfillhelper(img, sr-1, sc, color,origval,vis);
        floodfillhelper(img, sr+1, sc, color,origval,vis);
        floodfillhelper(img, sr, sc-1, color,origval,vis);
        floodfillhelper(img, sr, sc+1, color,origval,vis);

    }
    public static int[][] floodfill(int img[][],int sr,int sc,int color){
        boolean vis[][]=new boolean[img.length][img[0].length];
        int origval=img[sr][sc];
        floodfillhelper(img,sr,sc,color,origval,vis);
        return img;

    }
    public static void main(String args[]){
        int img[][]={{1,1,1},
                     {1,1,0},
                     {1,0,1}};
                     int image[][]=floodfill(img, 1, 1, 2);

                     for(int i=0;i<img.length;i++){
                        for(int j=0;j<img[0].length;j++){
                            System.out.print(img[i][j]+" ");
                        }
                        System.out.println();
                     }

    }
    
}
