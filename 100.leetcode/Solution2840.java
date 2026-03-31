import java.util.*;

public class Solution2840{
    public static boolean checkStrings1(String s1, String s2) {
        int[] evenfreq1 = new int[26];
        int[] oddfreq1 = new int[26];
        int[] evenfreq2 = new int[26];
        int[] oddfreq2 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenfreq1[s1.charAt(i) - 'a']++;
                evenfreq2[s2.charAt(i) - 'a']++;
            } else {
                oddfreq1[s1.charAt(i) - 'a']++;
                oddfreq2[s2.charAt(i) - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (evenfreq1[i] != evenfreq2[i] || 
                oddfreq1[i] != oddfreq2[i]) {
                return false;
            }
        }
        
        return true;
    }



    public static boolean checkStrings2(String s1, String s2) {
        List<Character> even1 = new ArrayList<>();
        List<Character> odd1 = new ArrayList<>();
        List<Character> even2 = new ArrayList<>();
        List<Character> odd2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                even1.add(s1.charAt(i));
                even2.add(s2.charAt(i));
            } else {
                odd1.add(s1.charAt(i));
                odd2.add(s2.charAt(i));
            }
        }

        Collections.sort(even1);
        Collections.sort(even2);
        Collections.sort(odd1);
        Collections.sort(odd2);

        if (even1.equals(even2) && odd1.equals(odd2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "abcdba";
        String s2 = "cabdab";
        System.out.println(checkStrings1(s1,s2));
    }
}