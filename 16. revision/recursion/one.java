public class one{
    public static void printdec(int n) {
        if(n == 1){
            System.out.print(n);
            return;
        }
         
        printdec(n-1);
        System.out.print(n + " ");
    }
    public  static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + sum(n-1)
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(fact(3));

    }
}