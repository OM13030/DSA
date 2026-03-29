public class clearRangeOfBits{
    public static int clearRangeOfBits(int n , int i , int j){
        int a = ((-1)<<(j+1)); // or ~0<<i   1100000
        int b = (1<<i)-1;  //                0000011
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[]args){
        int n = 10; 
        System.out.println(clearRangeOfBits(n, 2 , 4));

    }
} 