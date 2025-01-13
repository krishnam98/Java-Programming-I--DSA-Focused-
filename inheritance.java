public class inheritance {
    public static void main(String args[]){
        Fish fish1=new Fish ();
        fish1.eat();

    }
    
}
// base or parent class
class Animal{
    String color;

    void eat(){
        System.out.print("eats");
    }


}

class Fish extends Animal{
    void swim(){
        System.out.print("swims in water");
    }
}