public class palindrone{

    public static boolean isPalindrone(String str){
        int i = 0;
        int j = str.length();
        while(i < j){
            if(str.charAt(i) == str.charAt(j-1)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.err.println(isPalindrone(str));
    }
}