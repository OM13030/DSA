public class gridWays{
    public static int fact(int n){
        int fact = 1;
         for (int i = 1; i <= n; i++) {
             fact  = fact * i;
         }
         return fact;
    }
    public  static int gridWays(int i , int j , int n , int m){
        //base case
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == n){
            return 0;
        }


        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static int gridOptimizedWays(int i , int j , int n , int m){
        int num = fact((n-1) + (m-1));
        int den = fact(n-1) * fact(m-1);
        int ways = num / den;
        return ways;

    }

    public static void main(String[] args) {
        System.out.println(gridOptimizedWays(0, 0, 3, 3));
    }
}