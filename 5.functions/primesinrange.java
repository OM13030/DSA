import java.util.*;

public class primesinrange{
        public static boolean isPrime(int n){
        
        for(int  i =2;i<=Math.sqrt(n);i++){   
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
        for(int i =2;i<=n;i++){
                if(isPrime(i) == true ){
                    System.out.print(i + " ");
                }
        }
    }
}