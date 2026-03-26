// Recursion : Recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.

 // print numbers  from n to 1 (decreasing order)

 public class basics{

    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
 }