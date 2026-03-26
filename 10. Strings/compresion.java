public class compresion{
    public static String compress(String s){
        String newstr = "";

        for(int i =0; i< s.length();i++){
            Integer count = 1;
            while(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            newstr += s.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }


    public static void main(String[] args) {
        String s = "aaabbbcccccdd";
        System.out.println(compress(s));
    }
}