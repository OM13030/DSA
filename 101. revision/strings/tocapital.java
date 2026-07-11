public class tocapital{

    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hI mY naME is oM gaJEra";
        System.out.println(touppercase(str));
    }
}