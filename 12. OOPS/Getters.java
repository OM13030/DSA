// gettter : to return the value 
// setters : to modify the value 
//this     : this eyword is used to refer to the current object.


public class Getters{
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}



class Pen1 {
    private String color ;
    private int tip;


    //Getters

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }


    //Setters

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}