// Constructor is a special method which is invoked automatically at the tie of object creation'

//  -Constructor have the same name as class or structure
// - Constructors dont have a return type.(Not even void)
// - Constructors are only called once , at object creation.
// - Memory allocation happens when constructor is called


// typesof the constructor :
//                  1. NON- parameterized
//                  2. Parameterized
//                  3. Copy Constructor



public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.name);
        // Student s2 = new Student("om gajera",23);
        // System.out.println(s2.name +" " + s2.rollno);
        s1.name = "om gajera";
        s1.rollno = 234;
        s1.password = "jayambe123";


        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 50;

        Student s2 = new Student(s1);
        s2.password = "om1223";
        s1 .marks[2] = 23;
        // s1.marks karine lakhvathi 23 50 ne override kari dese
        // System.out.println(s2.name +
        //  " " + s2.password + " "+ s2.rollno);

        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
 
class Student{
    String name;
    int rollno;
    String password;
    int marks[];



    // NON- parameterized
    Student(){
            marks = new int[3];
            System.out.print("constructor was called...");
            // this.name = name;
    }

    //  Parameterized
    Student(String name,int  rollno){
        marks = new int[3];
        this.name = name ;
        this.rollno = rollno;
        this.marks = marks;

    }
    // aa 2 methods che ane ena names same che pan arguments alag he ene over loading no concept kevay

    // shallow  Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;

    // }

    //deep copy constructor
     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0;i<marks.length;i++){
            this.marks[i]  = s1.marks[i];
        }
     }
}




//DESTRUCTOR: Java ma destructor in built j hoi ke je vadharanu hoi ene automatically j delete ksri nakhse ane ene GARBAGE COLLECTOR kevay