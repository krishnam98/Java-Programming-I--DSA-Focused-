public class largestno {
    public static int largest(int numbers[]){
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){ 
            max=numbers[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int numbers[]={7,2,6,3,5};
        int maximum=largest(numbers);
        System.out.println("Largest number is: "+maximum);
    }
    
}
