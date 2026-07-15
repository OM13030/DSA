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
            for(int j = 1; j <= i; j++){
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }

    // to print even odd pattern
    public static void Evenoddpyramid(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    System.out.print((char)(j+64) + " ");
                }else{
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }


    //start triangle ulta
    public static void StarTriangleUlta(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n+1-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // even odd triangle ulta
    public static void EvenOddtriangleUlta(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n+1-i; j++){
                if(i % 2 == 1){
                    System.out.print((char)(i+64) + " ");
                }else{
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
    }

    //odd number triangle
    public static void Oddtriangle(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                 System.out.print((2*j)-1 + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1;j <= m; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
       Oddtriangle(n);
    }
}