public class linears {
    public static int linearsearch(int numbers[],int key){
for(int i=0;i<numbers.length;i++){
    if(numbers[i]==key){
        return i;
    }
}
return -1;
    }

    public static void main(String args[]){
        int numbers[]={1,2,10,35,75,8,9,40,7,20};
        int index=linearsearch(numbers,20);
        if(index==-1){
            System.out.print("NOT FOUND!");
        }
        else{System.out.println("key is at index: "+index);}
        
    }
    
}
