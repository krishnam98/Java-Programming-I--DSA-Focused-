public class hybridinheritance {

    
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

class Tuna extends Fish{
    void eaten(){
        System.out.print("can be eaten");

    }
}
class Shark extends Fish{
    void eaten(){
        System.out.print("can't be eaten");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.print("can fly");
    }
}

class Peacock extends Bird{
    void hobby(){
        System.out.print("dances");
    }
}


class Mammal extends Animal{
    void walk(){
        System.out.print("walks");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.print("barks");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.print("does meow!");
    }
}

