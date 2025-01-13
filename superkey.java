public class superkey {
    public static void main(String args[]){
        Horse h=new Horse();
        System.out.print(h.color);
        h.eat();
    }
   
    
}

class Animal{
    String color;
    void eat(){
        System.out.print("eats");
    }
    Animal(){
        System.out.println("animal constructor called....");
    }
}

class Horse extends Animal{
    
    
    Horse(){
        super.color="blue";
        super.eat();

        
        System.out.println("horse constructor called....");
    }

   

    
}
