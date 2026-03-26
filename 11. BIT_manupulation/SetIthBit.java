public class SetIthBit{
    public static int SetIthBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String[]args){
        int n = 10;
        System.out.println(SetIthBit(n, 2 ));

    }
} 