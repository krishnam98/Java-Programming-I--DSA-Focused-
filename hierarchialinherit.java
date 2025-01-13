public class hierarchialinherit{
    public static void main (String args[]){
        Fish f1=new Fish ();
        f1.eat();
        f1.swim();
        
    }

}

class Animal{
    void eat(){
        System.out.print("eats");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.print("swims");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.print("walks");
    }
}