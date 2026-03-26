public class clearIthBit{
    public static int clearIthBit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static void main(String[]args){
        int n = 10; 
        System.out.println(clearIthBit(n, 1));

    }
} 