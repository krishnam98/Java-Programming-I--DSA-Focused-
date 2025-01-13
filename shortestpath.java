public class shortestpath {
    public static float shortest(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // if(dir=='N'){
            //     y++;
            // }
            // else if(dir=='S'){
            //     y--;
            // }
            // else if(dir=='W'){
            //     x--;
            // }
            // else{x++;}

            switch (dir) {
                case 'N':
                y++;
                    break;
                case 'S':
                y--;
                break;
                case 'W':
                x--;
                break;

                default:x++;
                    break;
            }


        }
        int x2=x*x,y2=y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
        String path="WNEENESENNN";
       System.out.print(shortest(path));
    }
    
}
