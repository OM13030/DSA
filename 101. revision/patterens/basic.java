public class basic{


    public static void solidsquare(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // to print the number square
    public static void NumberSquare(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    // to print number square in straight side
    public static void NumStraightSquare(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //to print the alpha square 
    public static void alphaSquare(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        NumStraightSquare(n);
    }
}