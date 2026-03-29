import java.util.*;

public class primeornot{
    public static boolean isPrime(int n){
        
        boolean isPrime = true;
        for(int  i =2;i<=n-1;i++){
            if(n % i == 0 ){
               return false;
                
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("the 1 number is neither prime nor not prime ");
        }

        boolean prime = isPrime(n);
        if(prime == false){
            System.out.println(prime + "  " +  "the n is not a  prime number ");
        }
        else {
            System.out.println(prime + " " +  "the n is a prime number ");
        }
        
        }
}