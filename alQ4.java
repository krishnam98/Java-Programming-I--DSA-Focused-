import java.util.ArrayList;

public class alQ4{
    public static ArrayList<Integer> beautiful(int n){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        for(int i=2;i<=n;i++){
            ArrayList <Integer> temp=new ArrayList<>();

            for(int j=0;j<list.size();j++){       //odd
                if(2*list.get(j)-1<=n){
                    temp.add(2*list.get(j)-1);
                }
            }

            for(int k=0;k<list.size();k++){     // even
                if(2*list.get(k)<=n){
                    temp.add(2*list.get(k));
                }
            }

            list=temp;


        }

        return list;
    }

    public static void main(String args[]){
        int n=3;
        System.out.println(beautiful(n));
    }
}