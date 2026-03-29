public class comparision{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 =  new String("Tony");
        // aya s2 navo definr nthi karyo etle eni value s1 baju j   point thse 
        //ane s1 ane s3 nu comparision equal nai thy karanke s3 new banavelo che ena mate equals name nu function use karvu padse jo equal really karavu hoi to
        if(s1 == s2){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }



        if(s1 == s3){
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");
        }


        //for checking the value

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } 
    }
}