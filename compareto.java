public class compareto {
    public static void main(String args[]){
        // TIME COMPLEXITY=O(x*n)  where x is length of largest string & n is number of times the loops run;
        String fruit[]={"apple","mango","banana"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest =fruit[i];
            }
        }

        System.out.print(largest);


    }
    
}
