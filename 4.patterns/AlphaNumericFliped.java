import java.util.*;

public class AlphaNumericFliped{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int m = sc.nextInt();
        for(int i = 1; i<= m;i++){
            for(int j = 1; j<= m+1-i;j++){
                if(i%2!=0){
                    System.out.print((char)(i+64)+" ");
                }
                else{
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
    }
}