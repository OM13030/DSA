// Abstract Class:
//         ~ Cannot create an instance of abstract class 

//         ~ Can have abstract/non- abstract methods 

//         ~ Can have constructors

public class abstractclass{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
        System.out.println(h.color);  // default color brown avse bcoz e abstract class nu constructor

        // we can not call abstract class object at any how
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walk  s on 4 legs");
    }
}

class Chiken extends Animal{

    void changeColor(){
        color = "yellow";
    }
    
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
