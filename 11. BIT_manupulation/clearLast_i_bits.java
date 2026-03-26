public class clearLast_i_bits{
    public static int clearLastIBit(int n , int i){
        int bitmask = ((-1)<<i);
        return n & bitmask;
    }

    public static void main(String[]args){
        int n = 15; 
        System.out.println(clearLastIBit(n, 2));

    }
} 