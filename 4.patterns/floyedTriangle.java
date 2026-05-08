import java.util.*;

public class floyedTriangle{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int m = sc.nextInt();
        int a = 1;
        for(int i = 1; i<= m;i++){
            for(int j = 1; j<= i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}