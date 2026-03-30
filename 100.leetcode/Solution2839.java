public class Solution2839{
    public static boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if ((s1.charAt(0)) == (s2.charAt(2)) && (s1.charAt(2)) == (s2.charAt(0)) ){
            if(s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)){
                return true;
            }
            else if(s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1)){
                return true;
            }
            else{
                return false;
            }
        }
        if ((s1.charAt(1)) == (s2.charAt(3)) && (s1.charAt(3)) == (s2.charAt(1)) ){
            if(s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)){
                return true;
            }
            else if(s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbab";
        System.out.println(canBeEqual(s1,s2));
    }
}