public class swapping{
    public static void swapping(int  a, int b){
        int temp = a;
        a = b;
        b  = temp;
    

    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        swapping(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}