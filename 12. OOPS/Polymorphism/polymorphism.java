
//        - Compile time polymorphism
//           ~ method overloading 

//        - Run time polymorphism
//           ~ Method Overriding 

//  Poly : many
//  morphism : forms


// method Overring : Parent and child classes both contain the same function with a different defination


// methd overloading -------------

public class polymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1 , 2));
        System.out.println(calc.sum((float)1.5 , (float)2.5));
        System.out.println(calc.sum(1 , 2 , 3));

        // method overloadimg 
        Deer d = new Deer();
        d.eat();  // je class ne call lagaavyo che eno function override kari dese bija badha j same name na function ne 
    }
}

class Calculator {
    int sum (int a, int b ){
        return a + b ; 
    }

    float sum (float a, float b){
        return a + b;
    }

    int sum (int a, int b , int c){
        return a + b + c;
    }

}


// method overriding----------------------

class animal {
    void eat(){
        System.out.println("eats nothing");
    }
}

class Deer extends animal {
    void eat () {
        System.out.println("eats grass ");
    }
}