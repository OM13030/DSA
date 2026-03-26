//INHERITANCE : Inheritance is when the properties & mehtods of base class are passed on to a derived class. 


 
//types : 1. single lvl 2. multiple inheritance 3. hierarchal inheritance
//        4. hybrid inheritance




public class Inheritance{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
//   base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}


class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals {
    String breed;
}





//Derived class
// class Fish extends Animal {
//     int fins;

//     void swim (){
//         System.out.println("swims in water");
//     }
       
// }


