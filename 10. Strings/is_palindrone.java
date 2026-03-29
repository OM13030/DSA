public class is_palindrone{
    public static boolean is_palindrone(String str){
        for(int i = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(is_palindrone(str));

    }
}