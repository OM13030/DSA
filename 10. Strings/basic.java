
public class basic{
    public static void printLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = {
        //     'a','b','c','d','e'
        // };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // strings are immutabe means unchangable
        // System.out.println(str2 + str );

        // Scanner sc = new Scanner (System.in);
        // String name;
        // String name2;
        // name = sc.next();  // anathi tme om gajera lakhso etle khali om akhelu avse etla mate nextine lakhvau
        // name2 = sc.nextLine();
         
        // System.out.println( name2);

        // string length
        // String fullName = "om gajera";
        // System.out.println(fullName.length());

        //string concatiation
        String firstName = "om";
        String lastName = "gajera";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is this ");


        //string charAt method
        printLetters(fullName);


    }
}