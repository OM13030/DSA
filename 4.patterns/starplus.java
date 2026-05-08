import java.util.*;

public class starplus{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int m = sc.nextInt();
         int mid = m / 2 + 1;
                
        for(int i = 1; i<= m;i++){
            for(int j = 1; j<= m;j++){
               if(i==mid || j==mid){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }

            }
            System.out.println();
        }
    }
}