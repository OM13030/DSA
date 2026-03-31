public class Solution3474 {
    public static String generateString(String str1, String str2) {
        int n =  str1.length();
        int m = str2.length();
        int N = (m+n) - 1 ;

        char[] word = new char[N];
        boolean[] Canchange = new boolean[N];

        // fill the word[] with placeholder '$'
        for(int i = 0; i < N; i++){
            word[i] = '$';
        }

        // process for the T ( put str2 at the Tth index)
        for(int i = 0; i < n; i++){
            if(str1.charAt(i) == 'T'){
                int idx = i;

                for(int j = 0; j < m; j++){
                    if(word[idx] != '$' && word[idx] != str2.charAt(j)){
                        return "";
                    }
                    word[idx] = str2.charAt(j);
                    idx++;
                }
            }
        }

        // fill teporary a in the blank places
        for(int i = 0; i < N; i++){
            if(word[i] == '$'){
                word[i] = 'a';
                Canchange[i] = true;
            }
        }

        // Process for the F ( check if string at Fth index is same as str2 , if it is then change      temp word if there )
        for(int i = 0; i < n; i++){
            if(str1.charAt(i) == 'F'){
                if(isSame(word , str2 , i , m)){
                    boolean changed = false;

                    for(int k = i + m - 1; k >= i ; k--){
                        if(Canchange[k]){
                            word[k] = 'b';
                            Canchange[k] = false;
                            changed = true;
                            break;
                        }
                    }
                    if (!changed) return "";
                }
            }
        }
        return new String(word);

    }
    public static boolean isSame(char[] word, String str2, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (word[i] != str2.charAt(j)) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "TFTF";
        String str2 = "ab";
        System.out.println(generateString(str1, str2));

    }
}