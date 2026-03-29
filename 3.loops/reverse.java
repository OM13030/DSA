import java.util.*;

public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("please enter the number: ");
        int n = sc.nextInt();
        for(int i = 0;i<=n+1;i++){
            int ld = n % 10;
           System.out.print(ld);
            n = n/10;

        }
        System.out.println();
        
    }
}