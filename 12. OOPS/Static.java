//     Static Keyword : static keyword in java is used to share the same variable ormethd of a given class.

// applicaton :  ~ Properties
//               ~ Functions
//               ~ Blocks
//               ~ Nested Classes


//  statuc na lidhe multiple values no create thy memory ma etle memory save thse bv

public class Static{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll ;

    static String schoolName ;  // aa static che etle ane gamme tyare kok chnage kare etle badha object mate change thy jse 

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}