public class multiLinheri {
    public static void main(String args[]){
        Dog coco=new Dog();
        coco.breed="pug";
        coco.legs=4;
        coco.eat();
        System.out.print(coco.breed+","+coco.legs);
    }

    
}
class Animal{
    void eat(){
        System.out.print("eats");
    }
}

class mammal extends Animal{
    int legs;
}
class Dog extends mammal{
    String breed;
}
