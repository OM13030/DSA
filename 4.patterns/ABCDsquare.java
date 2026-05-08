
import java.util.*;

public class ABCDsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int m = sc.nextInt();
        for(int i = 1; i<= m;i++){
            for(int j = 1; j<= m;j++){
                System.out.print((char)(j + 64)+ " ");
            }
            System.out.println();
        }
    }
}