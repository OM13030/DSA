import java.util.*;

public class starTrianglefliped{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int m = sc.nextInt();
        for(int i = 1; i<= m;i++){
            // for(int j = m; j>= i;j--){          //   method 2
            //     System.out.print("* ");
            // }
            for(int j = 1; j<= m+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}