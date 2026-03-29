public class XpowerN{

    public static int optimizedPow(int a, int n){

        if(n ==0){
            return 1;
        }
        int halfpower = optimizedPow(a, n/2);
        int halfPowerSq = halfpower * halfpower; 

         //n is odd
         if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
         }

         return halfPowerSq;

    }

    public static int pow(int x , int n){
        if(n == 0){
            return 1;
        }
        //int xnm1 = pow(x,n-1);
        //int xn = x * xnm1;
        //return xn;

        return x * pow(x, n-1);

    }
    public static void main(String[] args) {
        //System.out.println(pow(5,12));
        System.out.println(optimizedPow(5, 3));
    }
}