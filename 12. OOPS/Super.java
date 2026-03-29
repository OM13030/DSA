// Super keyword : super keyword is used to refer immediate parent class object.

//  use : ~ to access parent's properties.
//  use : ~ to access parent's functions.
//  use : ~ to access parent's functions.


public class Super{
    public static void main(String[] args) {
        Hoorse h = new Hoorse();
        System.out.println(h.color);

    }
}


class Aaanimal {
    String color;
        Aaanimal(){
            System.out.println("animal constructor is called");
           
        }
}

class Hoorse extends Aaanimal{
    
    Hoorse(){
        super.color = "brown";

        System.out.println("horse constructor is called");
    }

    
}