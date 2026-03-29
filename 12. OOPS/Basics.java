

public class Basics{
    public static void main(String[]args){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Pen p2 = new Pen();
        p2.color = "red";
        System.out.println(p2.color);

    }
}

// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }
// }

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math)  {
         percentage = (chem + phy + math) /2;
    }
}