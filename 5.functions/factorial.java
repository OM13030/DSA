import java.util.*;

public class factorial{
    public static int factorial(int n){
        
        int fact = 1;
        for(int  i =1;i<=n;i++){
            fact = fact * i;
        }

        return fact;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ther value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter ther value of r : ");
        int r = sc.nextInt();

        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_rfact = factorial(n-r);
        int nCr = nfact / (rfact * n_rfact);
        System.out.println("nCr = " + nCr);


        }
}