public class q2{

    static String digits[] = {"zero", "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};

    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int last_digit = number%10;
        printDigits(number/10);
        System.out.print(digits[last_digit]+ " ");
    }
    public static void main(String[] args) {
        printDigits(1234);

    }
}